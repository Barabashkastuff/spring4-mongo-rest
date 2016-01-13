#spring4-mongo-rest
###REST maven archetype includes:
- Spring 4(java annotations)
- Spring-based REST
- Mongo DB connection
- DB configuring through property file in classpath
- REST-Service-DAO-DB structure
- Log4j logging (default logging is to tomcat8 logging directory)

##Generate your project in few steps:

1. Clone project

```
git clone https://github.com/Barabashkastuff/spring4-mongo-rest.git
```

2. cd to spring4-mongo-rest directory

```
cd spring4-mongo-rest
```

3. Install it in your local maven repository

```
mvn install
```

4.Generate skeleton

```
mvn archetype:generate 
  \     -DarchetypeGroupId=com.barabashkastuff.maven.archetype
  \     -DarchetypeArtifactId=spring4-mongo-rest 
  \     -DarchetypeVersion=1.0 
  \     -DgroupId=org.example 
  \     -DartifactId=exampleapp
```
Bintray
https://bintray.com/barabashkastuff/spring4-mongo-rest/spring4-mongo-rest/view

###//TODO
- Tests
- WEB-UI
- Gradle
