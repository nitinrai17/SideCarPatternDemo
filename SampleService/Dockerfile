FROM gradle:7.1-jdk8 AS GRADLE_BUILD 

COPY --chown=gradle:gradle build.gradle /home/gradle/

COPY --chown=gradle:gradle settings.gradle /home/gradle/

COPY --chown=gradle:gradle src /home/gradle/src

RUN gradle clean test build


FROM openjdk:8-jre-alpine

WORKDIR /app

EXPOSE 9991

COPY --from=GRADLE_BUILD /home/gradle/build/libs/*.jar /app/SampleService.jar

#ENTRYPOINT ["java", "-jar", "SampleService.jar"]