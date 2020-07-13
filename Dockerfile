FROM maven:latest AS build
WORKDIR /app9
COPY . /app9
RUN mvn clean package 

 

FROM openjdk:12-alpine
WORKDIR /app8
COPY --from=build /app9/target/ncbcustomer-app-service.jar /app8
ENTRYPOINT ["java","-jar","ncbcustomer-app-service.jar"]

