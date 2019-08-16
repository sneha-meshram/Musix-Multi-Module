FROM openjdk:11
EXPOSE 8081
WORKDIR /usrs/src
ADD ./target/userservices-0.0.1-SNAPSHOT.jar/usrs/src/userservices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","userservices-0.0.1-SNAPSHOT.jar"]

