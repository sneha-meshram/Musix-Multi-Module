FROM openjdk:11
EXPOSE 1515
WORKDIR /usrs/src
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar /usrs/src/eureka-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","eureka-server-0.0.1-SNAPSHOT.jar"]
