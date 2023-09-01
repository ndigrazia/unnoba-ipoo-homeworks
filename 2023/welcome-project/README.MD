# Creating a Project

```
mvn archetype:generate -DgroupId=ar.edu.unnoba.ipoo.com -DartifactId=practica1-eje6 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

# Clean the Project
```
mvn clean
```

# Build the Project
```
mvn package
```

# Run the Project standalone
First build the project, then:

```
java -cp target/practica1-eje6-1.0-SNAPSHOT.jar ar.edu.unnoba.ipoo.com.App
```

# Run the Project with MVN
```
mvn compile exec:java
```