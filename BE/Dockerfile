FROM openjdk:11-jdk

COPY ./backend/build/libs/*.jar cherrybnb.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "-Dcom.amazonaws.sdk.disableEc2Metadata=true", "/cherrybnb.jar"]
