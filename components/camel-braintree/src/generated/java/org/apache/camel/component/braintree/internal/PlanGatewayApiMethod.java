
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.braintreegateway.PlanGateway;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.braintreegateway.PlanGateway
 */
public enum PlanGatewayApiMethod implements ApiMethod {

    ALL(
        java.util.List.class,
        "all");

    private final ApiMethod apiMethod;

    private PlanGatewayApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(PlanGateway.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
