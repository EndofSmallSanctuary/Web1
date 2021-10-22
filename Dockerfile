FROM adoptopenjdk/openjdk16:ubi
ENV APP_HOME=/usr/app
WORKDIR ${APP_HOME}
COPY web1-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]
