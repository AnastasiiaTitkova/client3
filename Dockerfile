FROM openjdk:11
ADD /target/client3-0.0.1-SNAPSHOT.jar client3.jar
ENTRYPOINT ["java", "-jar", "client3.jar"]