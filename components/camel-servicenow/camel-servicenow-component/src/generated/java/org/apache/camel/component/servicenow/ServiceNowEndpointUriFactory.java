/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.servicenow;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ServiceNowEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":instanceName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(45);
        props.add("favorites");
        props.add("suppressPaginationHeader");
        props.add("oauthClientId");
        props.add("instanceName");
        props.add("requestModels");
        props.add("dateFormat");
        props.add("httpClientPolicy");
        props.add("release");
        props.add("sslContextParameters");
        props.add("mapper");
        props.add("retrieveTargetRecordOnImport");
        props.add("proxyPort");
        props.add("password");
        props.add("apiVersion");
        props.add("dateTimeFormat");
        props.add("apiUrl");
        props.add("proxyUserName");
        props.add("excludeReferenceLink");
        props.add("includeAvailableBreakdowns");
        props.add("includeAggregates");
        props.add("includeScoreNotes");
        props.add("sortBy");
        props.add("sortDir");
        props.add("key");
        props.add("table");
        props.add("models");
        props.add("oauthTokenUrl");
        props.add("resource");
        props.add("display");
        props.add("inputDisplayValue");
        props.add("proxyPassword");
        props.add("oauthClientSecret");
        props.add("userName");
        props.add("proxyHost");
        props.add("target");
        props.add("displayValue");
        props.add("includeAvailableAggregates");
        props.add("proxyAuthorizationPolicy");
        props.add("lazyStartProducer");
        props.add("includeScores");
        props.add("perPage");
        props.add("responseModels");
        props.add("timeFormat");
        props.add("suppressAutoSysField");
        props.add("topLevelOnly");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(5);
        secretProps.add("password");
        secretProps.add("oauthClientId");
        secretProps.add("oauthTokenUrl");
        secretProps.add("oauthClientSecret");
        secretProps.add("userName");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "servicenow".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "instanceName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

