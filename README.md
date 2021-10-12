# virtualzoo
### A demo REST project built with Spring Boot, WebFlux, MySql, etc.<br />

* MySql is required (todo: seup docker-compose to run mysql and this app image) <br />
* Update the application.properties with your database credentials:<br />
  > spring.datasource.username=root <br />
  > spring.datasource.password=root

* Build: mvn clean install
* Run: java -jar target/virtualzoo-0.0.1-SNAPSHOT.jar

***

### CURL examples
* get all animals <br />
> curl --location --request GET 'http://localhost:8080/myZoo/animals/all?orderBySpecies=false' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw ''

* do trick <br />
> curl --location --request GET 'http://localhost:8080/myZoo/animals/3c526c53/doTrick' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw ''

* learn trick <br />
> curl --location --request GET 'http://localhost:8080/myZoo/animals/3c526c53/learnTrick' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw ''
