# Conversor de Temperaturas

<!-- badges -->
![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white) ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=thymeleaf&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)

[Read in English](README.en.md)

Aplicação web em Java e Spring Boot que converte temperaturas entre Celsius, Fahrenheit e Kelvin, com validação do zero absoluto em cada escala.

## Funcionalidades

- Conversão entre Celsius, Fahrenheit e Kelvin, inclusive entre unidades iguais.
- Validação de entrada numérica.
- Bloqueio de valores abaixo do zero absoluto: -273,15 °C, -459,67 °F e 0 K.
- Resultado com duas casas decimais.
- Interface renderizada no servidor com Thymeleaf.

## Tecnologias

| Camada | Tecnologia |
| --- | --- |
| Linguagem | Java 17 |
| Framework | Spring Boot 4.1.1 (Web MVC, Actuator) |
| Interface | Thymeleaf e CSS |
| Build | Maven (Maven Wrapper incluído) |

## Estrutura

```
conversor_temperatura_java/
├── src/main/java/br/com/exercicio/conversortemperaturas/
│   ├── controller/TemperaturaController.java   # GET / e POST /converter
│   ├── service/TemperaturaService.java         # fórmulas e validações
│   └── model/TemperaturaDTO.java
├── src/main/resources/
│   ├── templates/conversor.html
│   └── static/css/style.css
├── src/test/
├── pom.xml
└── mvnw, mvnw.cmd
```

## Como executar

Pré-requisito: JDK 17 ou superior. O Maven não precisa estar instalado.

```bash
git clone https://github.com/Luisr-nunes/conversor_temperatura_java.git
cd conversor_temperatura_java

./mvnw spring-boot:run      # Linux/macOS
mvnw.cmd spring-boot:run    # Windows
```

Acesse `http://localhost:8080`, informe o valor, escolha as unidades de origem e destino e clique em **Converter**.

Para gerar o `.jar`:

```bash
./mvnw clean package
java -jar target/conversortemperaturas-0.0.1-SNAPSHOT.jar
```

## Testes

```bash
./mvnw test
```

Hoje a suíte cobre apenas a inicialização do contexto do Spring.

## Projeto relacionado

O mesmo conversor também aparece como exercício no repositório [POO](https://github.com/Luisr-nunes/POO).

## Autor

Luís Nunes — [GitHub](https://github.com/Luisr-nunes) · [LinkedIn](https://www.linkedin.com/in/luis-nunes-dev/)
