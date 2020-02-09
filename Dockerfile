FROM openjdk:8-jdk-alpine
COPY ./backend/target/backend-0.0.1-SNAPSHOT.jar calc-vue.jar
ENTRYPOINT ["java","-jar","/calc-vue.jar"]