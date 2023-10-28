FROM openjdk:17
EXPOSE 8080
ADD target/docker-demo-app.jar docker-demo-app.jar
ENTRYPOINT ["java","-jar","/docker-demo-app.jar"]