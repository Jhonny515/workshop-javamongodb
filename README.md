# workshopmongo

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.5.5**
  - Spring Boot Starter Web
  - Spring Boot Starter Data MongoDB
  - Spring Boot Starter Test
- **MongoDB**

## Ferramentas Necessárias

- **Java 17 JDK**
- **MongoDB** (instância local ou remota)
- **Maven** (ou utilize o Maven Wrapper incluído no projeto)
- **Git** (opcional, para versionamento)
- **IDE** (recomendado: Visual Studio Code, IntelliJ IDEA, Eclipse)

## Como Executar o Projeto

1. **Clone o repositório:**
   ```sh
   git clone <url-do-repositório>
   cd workshopmongo
   ```

2. **Certifique-se que o MongoDB está em execução**  
   O projeto espera uma instância do MongoDB rodando em `mongodb://localhost:27017/workshop_mongo`.

3. **Compile e execute o projeto usando o Maven Wrapper:**
   ```sh
   ./mvnw spring-boot:run
   ```
   Ou, se estiver no Windows:
   ```sh
   mvnw.cmd spring-boot:run
   ```

4. **Acesse a aplicação**  
   Por padrão, estará disponível em [http://localhost:8080](http://localhost:8080).

## Testes

Para executar os testes automatizados:
```sh
./mvnw test
```

---
Este projeto é um exemplo de aplicação RESTful utilizando Spring Boot e MongoDB.