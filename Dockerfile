FROM openjdk:17
VOLUME /tmp
ADD ./target/AplicacionesMovilesIIAntony-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]