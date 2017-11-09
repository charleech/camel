/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.component.direct.DirectComponent;
import org.junit.Test;

public class CamelContextDeadlockText {

    @Test(timeout = 5000)
    public void testComponentDeadlock() throws Exception {
        SimpleRegistry registry = new SimpleRegistry();
        registry.put("sql-connector", new DirectComponent() {
                @Override
                protected void doStart() throws Exception {
                    Component delegate = new DirectComponent();

                    getCamelContext().removeComponent("sql-connector-component");
                    getCamelContext().addService(delegate, true, true);
                    getCamelContext().addComponent("sql-connector-component", delegate);

                    super.doStart();
                }
            }
        );

        CamelContext context = new DefaultCamelContext(registry);
        context.start();
        context.getComponent("sql-connector", true, true);
        context.stop();
    }
}