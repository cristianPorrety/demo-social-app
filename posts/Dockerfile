FROM openjdk:17-jdk-slim
WORKDIR /home/crisrvmint
COPY target/posts-0.0.1-SNAPSHOT.jar posts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/posts-0.0.1-SNAPSHOT.jar"]