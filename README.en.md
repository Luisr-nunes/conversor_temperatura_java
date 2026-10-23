# Temperature Converter

[Ler em Português](README.md)

A Java and Spring Boot web application that converts temperatures between Celsius, Fahrenheit and Kelvin, validating absolute zero on each scale.

## Features

- Conversion between Celsius, Fahrenheit and Kelvin, including same-unit conversion.
- Numeric input validation.
- Rejection of values below absolute zero: -273.15 °C, -459.67 °F and 0 K.
- Result with two decimal places.
- Server-side rendered UI with Thymeleaf.

## Tech stack

| Layer | Technology |
| --- | --- |
| Language | Java 17 |
| Framework | Spring Boot 4.1.1 (Web MVC, Actuator) |
| UI | Thymeleaf and CSS |
| Build | Maven (Maven Wrapper included) |

## Structure

```
conversor_temperatura_java/
├── src/main/java/br/com/exercicio/conversortemperaturas/
│   ├── controller/TemperaturaController.java   # GET / and POST /converter
│   ├── service/TemperaturaService.java         # formulas and validation
│   └── model/TemperaturaDTO.java
├── src/main/resources/
│   ├── templates/conversor.html
│   └── static/css/style.css
├── src/test/
├── pom.xml
└── mvnw, mvnw.cmd
```

## Running

Requirement: JDK 17 or newer. Maven does not need to be installed.

```bash
git clone https://github.com/Luisr-nunes/conversor_temperatura_java.git
cd conversor_temperatura_java

./mvnw spring-boot:run      # Linux/macOS
mvnw.cmd spring-boot:run    # Windows
```

Open `http://localhost:8080`, enter a value, choose the source and target units and click **Converter**.

To build the `.jar`:

```bash
./mvnw clean package
java -jar target/conversortemperaturas-0.0.1-SNAPSHOT.jar
```

## Tests

```bash
./mvnw test
```

The suite currently only covers Spring context startup.

## Related project

The same converter also appears as an exercise in the [POO](https://github.com/Luisr-nunes/POO) repository.

## Author

Luís Nunes — [GitHub](https://github.com/Luisr-nunes) · [LinkedIn](https://www.linkedin.com/in/luis-nunes-dev/)
