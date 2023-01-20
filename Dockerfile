FROM openjdk:8
EXPOSE 8080
ADD target/docker-project.jar docker-project.jar
ENTRYPOINT ["java", "-jar", "/github-actions-demo.jar"]