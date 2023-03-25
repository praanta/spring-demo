FROM openjdk:21-ea-12-jdk-oraclelinux8
ENV username=PRASHANT
COPY ./build/libs/spring-demo-0.1.jar mypack/apps/spring-demo-0.1.jar
EXPOSE 8080
CMD java -jar mypack/apps/spring-demo-0.1.jar