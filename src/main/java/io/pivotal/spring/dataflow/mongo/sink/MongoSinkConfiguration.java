package io.pivotal.spring.dataflow.mongo.sink;

import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

import org.springframework.integration.annotation.ServiceActivator;

import com.mongodb.client.MongoDatabase;

@EnableBinding(Sink.class)
@EnableConfigurationProperties({MongoSinkProperties.class})
public class MongoSinkConfiguration {

    private static Logger LOG = LoggerFactory.getLogger(MongoSinkConfiguration.class);

    @Autowired
    MongoSinkProperties config;

    @Autowired
    MongoDatabase mongoDatabase;

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void mongoSink(String payload) {
        LOG.debug("Done: [payload={}:class={}] ", payload, payload.getClass().getName());

        String collectionName = config.collection;
        LOG.debug("Collection={}", collectionName);

        Document crit = Document.parse(payload);
        mongoDatabase.getCollection(collectionName).insertOne(crit);
    }

}