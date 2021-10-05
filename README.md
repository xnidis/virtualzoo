# virtualzoo
###A demo REST project build with Spring Boot, WebFlux, MySql, etc.<br />

* Create database "test" or update the application.properties with your database.<br />
Update the db credentials.<br />

* Execute the sql scripts in db/migration (todo: setup flyway).<br />
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