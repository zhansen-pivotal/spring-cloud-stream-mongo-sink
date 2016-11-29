package io.pivotal.spring.dataflow.mongo.sink;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mongodb.client.MongoDatabase;

@Configuration
@EnableConfigurationProperties({MongoSinkProperties.class})
public class MongoSinkConnection {
    private static final Logger LOG = LoggerFactory.getLogger(MongoSinkConnection.class);

    @Bean
    public MongoClient mongoClient(MongoSinkProperties config) {
        LOG.info("mongoClient: mongoUri=host:{},port:{}", config.host, config.port);
        MongoClient client = new MongoClient(config.host, config.port);
        return client;
    }

    @Bean
    public MongoDatabase mongoDatabase(MongoClient mongoClient, MongoSinkProperties config) {
        LOG.info("mongoDatabase: dbName={}", config.dbName);
        return mongoClient.getDatabase(config.dbName);
    }
}
