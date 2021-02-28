FROM openjdk:11
COPY target/*.jar springboot-helloworld.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springboot-helloworld.jar"]
