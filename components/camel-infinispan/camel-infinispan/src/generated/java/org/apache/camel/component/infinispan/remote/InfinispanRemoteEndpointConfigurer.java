/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.infinispan.remote;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class InfinispanRemoteEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        InfinispanRemoteEndpoint target = (InfinispanRemoteEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cachecontainer":
        case "cacheContainer": target.getConfiguration().setCacheContainer(property(camelContext, org.infinispan.client.hotrod.RemoteCacheManager.class, value)); return true;
        case "cachecontainerconfiguration":
        case "cacheContainerConfiguration": target.getConfiguration().setCacheContainerConfiguration(property(camelContext, org.infinispan.client.hotrod.configuration.Configuration.class, value)); return true;
        case "configurationproperties":
        case "configurationProperties": target.getConfiguration().setConfigurationProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "customlistener":
        case "customListener": target.getConfiguration().setCustomListener(property(camelContext, org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener.class, value)); return true;
        case "defaultvalue":
        case "defaultValue": target.getConfiguration().setDefaultValue(property(camelContext, java.lang.Object.class, value)); return true;
        case "eventtypes":
        case "eventTypes": target.getConfiguration().setEventTypes(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "flags": target.getConfiguration().setFlags(property(camelContext, java.lang.String.class, value)); return true;
        case "hosts": target.getConfiguration().setHosts(property(camelContext, java.lang.String.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "oldvalue":
        case "oldValue": target.getConfiguration().setOldValue(property(camelContext, java.lang.Object.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.infinispan.InfinispanOperation.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "querybuilder":
        case "queryBuilder": target.getConfiguration().setQueryBuilder(property(camelContext, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class, value)); return true;
        case "remappingfunction":
        case "remappingFunction": target.getConfiguration().setRemappingFunction(property(camelContext, java.util.function.BiFunction.class, value)); return true;
        case "resultheader":
        case "resultHeader": target.getConfiguration().setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "saslmechanism":
        case "saslMechanism": target.getConfiguration().setSaslMechanism(property(camelContext, java.lang.String.class, value)); return true;
        case "secure": target.getConfiguration().setSecure(property(camelContext, boolean.class, value)); return true;
        case "securityrealm":
        case "securityRealm": target.getConfiguration().setSecurityRealm(property(camelContext, java.lang.String.class, value)); return true;
        case "securityservername":
        case "securityServerName": target.getConfiguration().setSecurityServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "value": target.getConfiguration().setValue(property(camelContext, java.lang.Object.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"cacheContainer","cacheContainerConfiguration"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "cachecontainer":
        case "cacheContainer": return org.infinispan.client.hotrod.RemoteCacheManager.class;
        case "cachecontainerconfiguration":
        case "cacheContainerConfiguration": return org.infinispan.client.hotrod.configuration.Configuration.class;
        case "configurationproperties":
        case "configurationProperties": return java.util.Map.class;
        case "configurationuri":
        case "configurationUri": return java.lang.String.class;
        case "customlistener":
        case "customListener": return org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener.class;
        case "defaultvalue":
        case "defaultValue": return java.lang.Object.class;
        case "eventtypes":
        case "eventTypes": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "flags": return java.lang.String.class;
        case "hosts": return java.lang.String.class;
        case "key": return java.lang.Object.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "oldvalue":
        case "oldValue": return java.lang.Object.class;
        case "operation": return org.apache.camel.component.infinispan.InfinispanOperation.class;
        case "password": return java.lang.String.class;
        case "querybuilder":
        case "queryBuilder": return org.apache.camel.component.infinispan.InfinispanQueryBuilder.class;
        case "remappingfunction":
        case "remappingFunction": return java.util.function.BiFunction.class;
        case "resultheader":
        case "resultHeader": return java.lang.String.class;
        case "saslmechanism":
        case "saslMechanism": return java.lang.String.class;
        case "secure": return boolean.class;
        case "securityrealm":
        case "securityRealm": return java.lang.String.class;
        case "securityservername":
        case "securityServerName": return java.lang.String.class;
        case "username": return java.lang.String.class;
        case "value": return java.lang.Object.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        InfinispanRemoteEndpoint target = (InfinispanRemoteEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cachecontainer":
        case "cacheContainer": return target.getConfiguration().getCacheContainer();
        case "cachecontainerconfiguration":
        case "cacheContainerConfiguration": return target.getConfiguration().getCacheContainerConfiguration();
        case "configurationproperties":
        case "configurationProperties": return target.getConfiguration().getConfigurationProperties();
        case "configurationuri":
        case "configurationUri": return target.getConfiguration().getConfigurationUri();
        case "customlistener":
        case "customListener": return target.getConfiguration().getCustomListener();
        case "defaultvalue":
        case "defaultValue": return target.getConfiguration().getDefaultValue();
        case "eventtypes":
        case "eventTypes": return target.getConfiguration().getEventTypes();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "flags": return target.getConfiguration().getFlags();
        case "hosts": return target.getConfiguration().getHosts();
        case "key": return target.getConfiguration().getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "oldvalue":
        case "oldValue": return target.getConfiguration().getOldValue();
        case "operation": return target.getConfiguration().getOperation();
        case "password": return target.getConfiguration().getPassword();
        case "querybuilder":
        case "queryBuilder": return target.getConfiguration().getQueryBuilder();
        case "remappingfunction":
        case "remappingFunction": return target.getConfiguration().getRemappingFunction();
        case "resultheader":
        case "resultHeader": return target.getConfiguration().getResultHeader();
        case "saslmechanism":
        case "saslMechanism": return target.getConfiguration().getSaslMechanism();
        case "secure": return target.getConfiguration().isSecure();
        case "securityrealm":
        case "securityRealm": return target.getConfiguration().getSecurityRealm();
        case "securityservername":
        case "securityServerName": return target.getConfiguration().getSecurityServerName();
        case "username": return target.getConfiguration().getUsername();
        case "value": return target.getConfiguration().getValue();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "configurationproperties":
        case "configurationProperties": return java.lang.String.class;
        default: return null;
        }
    }
}

