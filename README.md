# fake2026v
[![CI/CD Pipeline](https://github.com/egp1020/fake2026v/actions/workflows/build.yml/badge.svg)](https://github.com/egp1020/fake2026v/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=egp1020_fake2026v&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=egp1020_fake2026v)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=egp1020_fake2026v&metric=bugs)](https://sonarcloud.io/summary/new_code?id=egp1020_fake2026v)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=egp1020_fake2026v&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=egp1020_fake2026v)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=egp1020_fake2026v&metric=coverage)](https://sonarcloud.io/summary/new_code?id=egp1020_fake2026v)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=egp1020_fake2026v&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=egp1020_fake2026v)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=egp1020_fake2026v&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=egp1020_fake2026v)

BIENVENIDO A MI APP PARA GENERACION DE DATOS ALEATORIOS

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```
