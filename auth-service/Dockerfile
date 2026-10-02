# Stage 1: Build
    #Starts build with Maven 3.9 and JDK 17
FROM maven:3.9-eclipse-temurin-17 AS build
    # Creates and sets /app as the working directory
WORKDIR /app
    # Copy Maven pom.xml file into the working directory
COPY pom.xml . 
    # Downloads Java dependencies then caches for further updates
RUN mvn dependency:go-offline
    # Copies source code
COPY src ./src
    # Skips tests and builds the JAR file
RUN mvn clean package -DskipTests

# Stage 2: Run
    # Starts container with JRE 17
FROM eclipse-temurin:17-jre
    # Creates and sets /app as the working directory
WORKDIR /app
    # Copies JAR file and renames to app.jar
COPY --from=build /app/target/*.jar app.jar
    # Informs Docker that app listens on port 8081
EXPOSE 8081
    # Declares execution command for "Auth Service"
ENTRYPOINT ["java", "-jar", "app.jar"]