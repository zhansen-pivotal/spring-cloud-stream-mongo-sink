# spring-cloud-stream-mongo-sink
A Spring Cloud Dataflow Stream sink for MongoDB. 

##**Options**

The **mongo-sink** has the following options:

* **mongo.dbName**
       * _The Mongo Database Name to connect to. <**DEFAULT** : default>_
 
* **mongo.host**
       * _The host machine MongoDB is running on.<**DEFAULT** : localhost>_
 
* **mongo.port**
       * _The Mongo Database port. <**DEFAULT** : 27017>_
  
* **mongo.collection**
       * _The Mongo Database collection to write out data. <**DEFAULT** : default>_
 

##**Build**

```
$ mvn clean package
```
