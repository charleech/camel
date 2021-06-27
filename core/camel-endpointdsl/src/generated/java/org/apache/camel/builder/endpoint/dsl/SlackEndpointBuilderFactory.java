/*
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
package org.apache.camel.builder.endpoint.dsl;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;

/**
 * Send and receive messages to/from Slack.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SlackEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Slack component.
     */
    public interface SlackEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedSlackEndpointConsumerBuilder advanced() {
            return (AdvancedSlackEndpointConsumerBuilder) this;
        }
        /**
         * The token to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder token(String token) {
            doSetProperty("token", token);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Type of conversation.
         * 
         * The option is a:
         * &lt;code&gt;com.slack.api.model.ConversationType&lt;/code&gt; type.
         * 
         * Default: PUBLIC_CHANNEL
         * Group: consumer
         * 
         * @param conversationType the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder conversationType(
                ConversationType conversationType) {
            doSetProperty("conversationType", conversationType);
            return this;
        }
        /**
         * Type of conversation.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.slack.api.model.ConversationType&lt;/code&gt; type.
         * 
         * Default: PUBLIC_CHANNEL
         * Group: consumer
         * 
         * @param conversationType the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder conversationType(
                String conversationType) {
            doSetProperty("conversationType", conversationType);
            return this;
        }
        /**
         * The Max Result for the poll.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param maxResults the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder maxResults(String maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * Create exchanges in natural order (oldest to newest) or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param naturalOrder the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder naturalOrder(boolean naturalOrder) {
            doSetProperty("naturalOrder", naturalOrder);
            return this;
        }
        /**
         * Create exchanges in natural order (oldest to newest) or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param naturalOrder the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder naturalOrder(String naturalOrder) {
            doSetProperty("naturalOrder", naturalOrder);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyMessageWhenIdle the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyMessageWhenIdle the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * The Server URL of the Slack instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: https://slack.com
         * Group: consumer
         * 
         * @param serverUrl the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder serverUrl(String serverUrl) {
            doSetProperty("serverUrl", serverUrl);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffErrorThreshold the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffErrorThreshold the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffIdleThreshold the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffIdleThreshold the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffMultiplier the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder backoffMultiplier(
                int backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffMultiplier the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder backoffMultiplier(
                String backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: scheduler
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: scheduler
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: scheduler
         * 
         * @param greedy the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder greedy(boolean greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: scheduler
         * 
         * @param greedy the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder greedy(String greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: scheduler
         * 
         * @param initialDelay the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: scheduler
         * 
         * @param initialDelay the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder initialDelay(String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: scheduler
         * 
         * @param repeatCount the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder repeatCount(long repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: scheduler
         * 
         * @param repeatCount the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder repeatCount(String repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.LoggingLevel&lt;/code&gt; type.
         * 
         * Default: TRACE
         * Group: scheduler
         * 
         * @param runLoggingLevel the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.LoggingLevel&lt;/code&gt; type.
         * 
         * Default: TRACE
         * Group: scheduler
         * 
         * @param runLoggingLevel the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder runLoggingLevel(
                String runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option is a:
         * &lt;code&gt;java.util.concurrent.ScheduledExecutorService&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param scheduledExecutorService the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.concurrent.ScheduledExecutorService&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param scheduledExecutorService the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component. Use value spring or quartz for built in scheduler.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Default: none
         * Group: scheduler
         * 
         * @param scheduler the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder scheduler(Object scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component. Use value spring or quartz for built in scheduler.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Default: none
         * Group: scheduler
         * 
         * @param scheduler the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder scheduler(String scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * schedulerProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: scheduler
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder schedulerProperties(
                String key,
                Object value) {
            doSetMultiValueProperty("schedulerProperties", "scheduler." + key, value);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * schedulerProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: scheduler
         * 
         * @param values the values
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder schedulerProperties(Map values) {
            doSetMultiValueProperties("schedulerProperties", "scheduler.", values);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param startScheduler the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder startScheduler(
                boolean startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param startScheduler the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder startScheduler(
                String startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option is a:
         * &lt;code&gt;java.util.concurrent.TimeUnit&lt;/code&gt; type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         * 
         * @param timeUnit the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder timeUnit(TimeUnit timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.concurrent.TimeUnit&lt;/code&gt; type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         * 
         * @param timeUnit the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder timeUnit(String timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param useFixedDelay the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder useFixedDelay(boolean useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param useFixedDelay the value to set
         * @return the dsl builder
         */
        default SlackEndpointConsumerBuilder useFixedDelay(String useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Slack component.
     */
    public interface AdvancedSlackEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default SlackEndpointConsumerBuilder basic() {
            return (SlackEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedSlackEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedSlackEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedSlackEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedSlackEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.PollingConsumerPollStrategy&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param pollStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedSlackEndpointConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.PollingConsumerPollStrategy&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param pollStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedSlackEndpointConsumerBuilder pollStrategy(
                String pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Slack component.
     */
    public interface SlackEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSlackEndpointProducerBuilder advanced() {
            return (AdvancedSlackEndpointProducerBuilder) this;
        }
        /**
         * The token to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default SlackEndpointProducerBuilder token(String token) {
            doSetProperty("token", token);
            return this;
        }
        /**
         * Use a Slack emoji as an avatar.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param iconEmoji the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SlackEndpointProducerBuilder iconEmoji(String iconEmoji) {
            doSetProperty("iconEmoji", iconEmoji);
            return this;
        }
        /**
         * The avatar that the component will use when sending message to a
         * channel or user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param iconUrl the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SlackEndpointProducerBuilder iconUrl(String iconUrl) {
            doSetProperty("iconUrl", iconUrl);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SlackEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SlackEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * This is the username that the bot will have when sending messages to
         * a channel or user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SlackEndpointProducerBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * The incoming webhook URL.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param webhookUrl the value to set
         * @return the dsl builder
         */
        default SlackEndpointProducerBuilder webhookUrl(String webhookUrl) {
            doSetProperty("webhookUrl", webhookUrl);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Slack component.
     */
    public interface AdvancedSlackEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default SlackEndpointProducerBuilder basic() {
            return (SlackEndpointProducerBuilder) this;
        }
    }

    /**
     * Builder for endpoint for the Slack component.
     */
    public interface SlackEndpointBuilder
            extends
                SlackEndpointConsumerBuilder,
                SlackEndpointProducerBuilder {
        default AdvancedSlackEndpointBuilder advanced() {
            return (AdvancedSlackEndpointBuilder) this;
        }
        /**
         * The token to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default SlackEndpointBuilder token(String token) {
            doSetProperty("token", token);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Slack component.
     */
    public interface AdvancedSlackEndpointBuilder
            extends
                AdvancedSlackEndpointConsumerBuilder,
                AdvancedSlackEndpointProducerBuilder {
        default SlackEndpointBuilder basic() {
            return (SlackEndpointBuilder) this;
        }
    }

    /**
     * Proxy enum for <code>com.slack.api.model.ConversationType</code> enum.
     */
    enum ConversationType {
        PUBLIC_CHANNEL,
        PRIVATE_CHANNEL,
        MPIM,
        IM;
    }

    public interface SlackBuilders {
        /**
         * Slack (camel-slack)
         * Send and receive messages to/from Slack.
         * 
         * Category: social
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-slack
         * 
         * Syntax: <code>slack:channel</code>
         * 
         * Path parameter: channel (required)
         * The channel name (syntax #name) or slackuser (syntax userName) to
         * send a message directly to an user.
         * 
         * @param path channel
         * @return the dsl builder
         */
        default SlackEndpointBuilder slack(String path) {
            return SlackEndpointBuilderFactory.endpointBuilder("slack", path);
        }
        /**
         * Slack (camel-slack)
         * Send and receive messages to/from Slack.
         * 
         * Category: social
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-slack
         * 
         * Syntax: <code>slack:channel</code>
         * 
         * Path parameter: channel (required)
         * The channel name (syntax #name) or slackuser (syntax userName) to
         * send a message directly to an user.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path channel
         * @return the dsl builder
         */
        default SlackEndpointBuilder slack(String componentName, String path) {
            return SlackEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static SlackEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class SlackEndpointBuilderImpl extends AbstractEndpointBuilder implements SlackEndpointBuilder, AdvancedSlackEndpointBuilder {
            public SlackEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SlackEndpointBuilderImpl(path);
    }
}