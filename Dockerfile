FROM openjdk:11
COPY target/demoApp.jar demoApp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/demoApp.jar"]