# Projeto de Cadastro e Controle de Produtos

Este é um projeto Java para cadastro e controle de produtos, utilizando tecnologias como Spring Boot, Hibernate, e manipulação de dados através de API.

## Configuração do Projeto

Para replicar o projeto, siga estas instruções:

1. Clone este repositório para o seu ambiente de desenvolvimento:
git clone <url-do-repositorio>

2. Importe o projeto para a sua IDE favorita (por exemplo, IntelliJ, Eclipse).

3. Certifique-se de ter o Maven instalado no seu sistema.

4. Execute o Maven para baixar as dependências do projeto:
mvn clean install

5. Configure o banco de dados de acordo com as suas preferências no arquivo application.properties.

## Dependências

O projeto utiliza as seguintes dependências:

- [Spring Boot Starter Web](https://spring.io/projects/spring-boot) - Para iniciar o desenvolvimento de aplicativos da web com Spring MVC.
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools) - Ferramentas de desenvolvimento para um ciclo de desenvolvimento mais produtivo.
- [Spring Boot Starter Test](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-testing) - Dependências para testes automatizados em aplicativos Spring Boot.
- [Spring Boot Starter Data JPA](https://spring.io/projects/spring-data-jpa) - Suporte para persistência de dados usando JPA com Hibernate.
- [Spring Boot Starter Validation](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.validation) - Dependências para validação de entrada de dados em aplicativos Spring Boot.
- [Flyway Core](https://flywaydb.org/) - Controle de migração de banco de dados.
- [Flyway Database Oracle](https://flywaydb.org/documentation/database/oracle) - Extensão Flyway para suporte ao Oracle Database.


Para gerar um projeto semelhante, você pode utilizar o Spring Initializr e adicionar as dependências acima.

## Configuração do Banco de Dados
O Hibernate, integrado ao Spring Boot, permite a configuração do banco de dados por meio de anotações nas entidades Java. Certifique-se de configurar corretamente o arquivo application.properties com as credenciais de acesso ao banco de dados desejado.

Exemplo de configuração do application.properties para o MySQL:

spring.datasource.url=jdbc:mysql://localhost:3306/meu_banco_de_dados

spring.datasource.username=usuario

spring.datasource.password=senha

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

spring.jpa.hibernate.ddl-auto=update

## Executando o Projeto
Após seguir as etapas de configuração, você pode executar o projeto com o seguinte comando:

bash
Copy code
mvn spring-boot:run
Isso iniciará o aplicativo Spring Boot e você poderá acessar a API em http://localhost:8080.

A partir daqui, você pode começar a desenvolver sua aplicação de cadastro e controle de produtos!

Nota: Certifique-se de ter um ambiente de desenvolvimento Java configurado e um banco de dados disponível para a configuração correta do projeto.
