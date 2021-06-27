/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elsql;

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
public class ElsqlComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElsqlComponent target = (ElsqlComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "datasource":
        case "dataSource": target.setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "databasevendor":
        case "databaseVendor": target.setDatabaseVendor(property(camelContext, org.apache.camel.component.elsql.ElSqlDatabaseVendor.class, value)); return true;
        case "elsqlconfig":
        case "elSqlConfig": target.setElSqlConfig(property(camelContext, com.opengamma.elsql.ElSqlConfig.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "resourceuri":
        case "resourceUri": target.setResourceUri(property(camelContext, java.lang.String.class, value)); return true;
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
        case "datasource":
        case "dataSource": return javax.sql.DataSource.class;
        case "databasevendor":
        case "databaseVendor": return org.apache.camel.component.elsql.ElSqlDatabaseVendor.class;
        case "elsqlconfig":
        case "elSqlConfig": return com.opengamma.elsql.ElSqlConfig.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "resourceuri":
        case "resourceUri": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ElsqlComponent target = (ElsqlComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "datasource":
        case "dataSource": return target.getDataSource();
        case "databasevendor":
        case "databaseVendor": return target.getDatabaseVendor();
        case "elsqlconfig":
        case "elSqlConfig": return target.getElSqlConfig();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "resourceuri":
        case "resourceUri": return target.getResourceUri();
        default: return null;
        }
    }
}

