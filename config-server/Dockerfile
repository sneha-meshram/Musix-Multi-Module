FROM openjdk:11
EXPOSE 3300
WORKDIR /usrs/src
ADD ./target/config-server-0.0.1-SNAPSHOT.jar/usrs/src/config-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","config-server-0.0.1-SNAPSHOT.jar]
