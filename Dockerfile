FROM openjdk:11
COPY target/demoApp.jar demoApp.jar
ENTRYPOINT ["java","-jar","/demoApp.jar"]