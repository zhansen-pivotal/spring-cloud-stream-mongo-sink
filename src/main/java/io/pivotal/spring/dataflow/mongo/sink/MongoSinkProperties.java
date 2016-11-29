package io.pivotal.spring.dataflow.mongo.sink;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mongo")
public class MongoSinkProperties {

    /**
     * The MongoDB database
     */
    @Value("${dbName:default}")
    public String dbName;

    /**
     * The MongoDB collection
     */
    @Value("${collection:default}")
    public String collection;

    /**
     * The MongoDB host
     */
    @Value("${host:localhost}")
    public String host;

    /**
     * The MongoDB port
     */
    @Value("${port:27017}")
    public int port;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }
}
