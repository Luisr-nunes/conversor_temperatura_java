# Conversor de Temperaturas

PT | [EN](#temperature-converter)

Conversor de temperaturas online entre Celsius, Fahrenheit e Kelvin — simples, rapido e direto.

## Sobre o Projeto

O Conversor de Temperaturas e uma aplicacao web desenvolvida com Spring Boot para realizar conversoes entre as escalas Celsius, Fahrenheit e Kelvin.

A aplicacao valida os valores informados de acordo com o zero absoluto, informa entradas invalidas e exibe o resultado formatado com duas casas decimais.

## Funcionalidades

- Conversao entre Celsius, Fahrenheit e Kelvin
- Conversao entre unidades iguais
- Validacao de entrada numerica
- Validacao do zero absoluto em cada escala
- Resultado formatado com duas casas decimais
- Interface web renderizada com Thymeleaf

## Tecnologias Utilizadas

| Camada | Tecnologia | Descricao |
| --- | --- | --- |
| Linguagem | Java 17 | Implementacao da aplicacao |
| Framework | Spring Boot 4.1.1 | Configuracao e execucao do projeto |
| Web | Spring MVC | Controller e rotas HTTP |
| View | Thymeleaf | Renderizacao da interface web |
| Estilo | CSS3 | Estilizacao da pagina |
| Build | Maven | Gerenciamento e empacotamento |

## Como Rodar o Codigo

### Pre-requisitos

- JDK 17 ou superior

### Instalacao

```bash
# Clone o repositorio
git clone https://github.com/Luisr-nunes/conversor_temperatura_java.git
cd conversor_temperatura_java
```

### Desenvolvimento

No Windows:

```bash
./mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

Depois, acesse [http://localhost:8080](http://localhost:8080).

### Build de Producao

```bash
./mvnw.cmd clean package
```

O arquivo `.jar` sera gerado na pasta `target/`.

## Como Usar

1. Informe o valor da temperatura.
2. Selecione a unidade de origem.
3. Selecione a unidade de destino.
4. Clique em **Converter**.

Unidades disponiveis:

- Celsius (C)
- Fahrenheit (F)
- Kelvin (K)

## Estrutura do Projeto

```text
conversor_temperatura_java/
|-- src/
|   |-- main/
|   |   |-- java/br/com/exercicio/conversortemperaturas/
|   |   |   |-- controller/TemperaturaController.java
|   |   |   |-- model/TemperaturaDTO.java
|   |   |   |-- service/TemperaturaService.java
|   |   |-- resources/
|   |       |-- static/css/style.css
|   |       |-- templates/conversor.html
|   |-- test/
|-- pom.xml
|-- mvnw
|-- mvnw.cmd
```

## Testes

```bash
./mvnw.cmd test
```

## English

<a id="temperature-converter"></a>

# Temperature Converter

PT | EN

Online temperature converter between Celsius, Fahrenheit and Kelvin — simple, fast and direct.

## About

Temperature Converter is a web application built with Spring Boot to convert values between Celsius, Fahrenheit and Kelvin scales.

The application validates values according to absolute zero, reports invalid input and displays results formatted to two decimal places.

## Features

- Conversion between Celsius, Fahrenheit and Kelvin
- Conversion between equal units
- Numeric input validation
- Absolute zero validation for each scale
- Result formatted to two decimal places
- Thymeleaf-rendered web interface

## Tech Stack

| Layer | Technology | Description |
| --- | --- | --- |
| Language | Java 17 | Application implementation |
| Framework | Spring Boot 4.1.1 | Project configuration and runtime |
| Web | Spring MVC | HTTP controllers and routes |
| View | Thymeleaf | Web interface rendering |
| Styling | CSS3 | Page styling |
| Build | Maven | Dependency management and packaging |

## How to Run the Code

### Prerequisites

- JDK 17 or newer

### Setup

```bash
git clone https://github.com/Luisr-nunes/conversor_temperatura_java.git
cd conversor_temperatura_java
```

### Development

On Windows:

```bash
./mvnw.cmd spring-boot:run
```

On Linux or macOS:

```bash
./mvnw spring-boot:run
```

Then open [http://localhost:8080](http://localhost:8080).

### Production Build

```bash
./mvnw.cmd clean package
```

The `.jar` file will be generated in the `target/` directory.

## How to Use

1. Enter the temperature value.
2. Select the source unit.
3. Select the target unit.
4. Click **Convert**.

Available units:

- Celsius (C)
- Fahrenheit (F)
- Kelvin (K)

## Project Structure

The project is organized into controllers, a data transfer object, a conversion service, Thymeleaf templates and static CSS resources.

## Tests

```bash
./mvnw.cmd test
```

## Desenvolvido por

Luis Nunes