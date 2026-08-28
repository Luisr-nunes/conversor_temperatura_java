# Conversor de Temperaturas

Aplicação web desenvolvida com Spring Boot para conversão entre Celsius, Fahrenheit e Kelvin.

## Tecnologias

- Java 17
- Spring Boot 4.1.1
- Spring MVC
- Thymeleaf
- Maven

## Funcionalidades

- Conversão entre Celsius, Fahrenheit e Kelvin
- Validação de valores abaixo do zero absoluto
- Validação de entrada numérica
- Exibição de mensagens de erro e do resultado da conversão

## Como executar

### Pré-requisitos

- JDK 17 ou superior

### Execução com Maven Wrapper

No Windows:

```bash
./mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

Também é possível gerar o pacote da aplicação:

```bash
./mvnw.cmd clean package
```

Após iniciar a aplicação, acesse [http://localhost:8080](http://localhost:8080).

## Utilização

1. Informe o valor da temperatura.
2. Selecione a unidade de origem.
3. Selecione a unidade de destino.
4. Clique em **Converter**.

As unidades disponíveis são:

- Celsius (C)
- Fahrenheit (F)
- Kelvin (K)

## Estrutura principal

```text
src/
├── main/
│   ├── java/br/com/exercicio/conversortemperaturas/
│   │   ├── controller/TemperaturaController.java
│   │   ├── model/TemperaturaDTO.java
│   │   └── service/TemperaturaService.java
│   └── resources/
│       ├── static/css/style.css
│       └── templates/conversor.html
└── test/
```

## Testes

Para executar os testes automatizados:

```bash
./mvnw.cmd test
```