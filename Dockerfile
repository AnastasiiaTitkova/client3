FROM openjdk:11
ADD /client3-0.0.1-SNAPSHOT.jar client3.jar
ENTRYPOINT ["java", "-jar", "client3.jar"]