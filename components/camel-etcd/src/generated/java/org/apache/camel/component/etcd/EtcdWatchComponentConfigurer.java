/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd;

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
public class EtcdWatchComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.etcd.EtcdConfiguration getOrCreateConfiguration(EtcdWatchComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.etcd.EtcdConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EtcdWatchComponent target = (EtcdWatchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.etcd.EtcdConfiguration.class, value)); return true;
        case "fromindex":
        case "fromIndex": getOrCreateConfiguration(target).setFromIndex(property(camelContext, long.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "recursive": getOrCreateConfiguration(target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": getOrCreateConfiguration(target).setSendEmptyExchangeOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "servicepath":
        case "servicePath": getOrCreateConfiguration(target).setServicePath(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "timeout": getOrCreateConfiguration(target).setTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "uris": getOrCreateConfiguration(target).setUris(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "username":
        case "userName": getOrCreateConfiguration(target).setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.etcd.EtcdConfiguration.class;
        case "fromindex":
        case "fromIndex": return long.class;
        case "password": return java.lang.String.class;
        case "recursive": return boolean.class;
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": return boolean.class;
        case "servicepath":
        case "servicePath": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "timeout": return java.lang.Long.class;
        case "uris": return java.lang.String.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        case "username":
        case "userName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EtcdWatchComponent target = (EtcdWatchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "fromindex":
        case "fromIndex": return getOrCreateConfiguration(target).getFromIndex();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "recursive": return getOrCreateConfiguration(target).isRecursive();
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": return getOrCreateConfiguration(target).isSendEmptyExchangeOnTimeout();
        case "servicepath":
        case "servicePath": return getOrCreateConfiguration(target).getServicePath();
        case "sslcontextparameters":
        case "sslContextParameters": return getOrCreateConfiguration(target).getSslContextParameters();
        case "timeout": return getOrCreateConfiguration(target).getTimeout();
        case "uris": return getOrCreateConfiguration(target).getUris();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "username":
        case "userName": return getOrCreateConfiguration(target).getUserName();
        default: return null;
        }
    }
}

