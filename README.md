# Basic Restful Service with Spring Web, JPA & H2 (Full)

Exercice 10 - https://spring.io/guides/tutorials/rest/

## Commands

- `npm install` to install the assets
- `npm run-script watch` to load automatically if any js file changed
- `./mvnw spring-boot:run` to run
- `./mvnw clean package` to build and then `java -jar target/springrestreactjs-0.0.1-SNAPSHOT.jar --server.port=8080`

**General**
- `curl -u greg:turnquist localhost:8080/api` to view the main endpoints
- Access interface `http://localhost:8080/#` with `greg` and `turnquist`

**Employees**
- View employees `curl -v -u greg:turnquist localhost:8080/employees?size=2 | json_pp pretty,canonical`
- View employee schema `curl -u greg:turnquist http://localhost:8080/api/profile/employees -H "Accept:application/schema+json"`
- View an employee `curl -v -u greg:turnquist localhost:8080/employees/1 | json_pp pretty,canonical`
- Create `curl -v -X -u greg:turnquist POST localhost:8080/employees -H 'Content-Type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'`
- Update `curl -v -X -u greg:turnquist PUT localhost:8080/employees/3 -H 'Content-Type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'`
- Delete `curl -v -X -u greg:turnquist DELETE localhost:8080/employees/1`
