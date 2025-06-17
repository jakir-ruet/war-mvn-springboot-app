## Getting Started

### Create application

#### Build & Run the Application

```bash
mvn clean install # Build
mvn test # Test
mvn spring-boot:run # Run, Or
java -jar /target/war-mvn-springboot-app-0.0.1-SNAPSHOT.war # Run JAR
```

#### If need to change the port `src/main/resources/application.properties`

```bash
spring.application.name=war-mvn-springboot-app
spring.security.user.name=admin
spring.security.user.password=mySecurePassword
spring.security.user.roles=USER,ADMIN
server.port=8085
```

#### Or, If need to change the port `src/main/resources/application.yaml`

```bash
spring:
  application:
    name: war-mvn-springboot-app
  security:
    user:
      name: admin
      password: mySecurePassword
      roles:
        - USER
        - ADMIN
server:
  port: 8085
```

#### On Web Browser

```bash
http://127.0.0.1:8085
http://127.0.0.1:8085/home
UserName = admin
Password = mySecurePassword
```
