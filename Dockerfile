FROM maven:latest AS build
WORKDIR /app
COPY . /app
RUN mvn clean package 

 

FROM openjdk:12-alpine
WORKDIR /app2
COPY --from=build /app/target/ncbcustomer-app-service.war /app2
ENTRYPOINT ["java","-jar","ncbcustomer-app-service.war"]

