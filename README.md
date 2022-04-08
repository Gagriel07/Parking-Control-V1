# Parking-Control-V1
Spring Boot Parking Control

Projeto todo foi contruido com base no Framework Spring Boot do JAVA.

## Importante
Para utilizar a aplicação configure o Hibernate em __resources/templates/aplication.properties__

spring.datasource.url= // Colocar o endereço do servidor do Banco de Dados

spring.datasource.username= // Usuário do Banco de Dados

spring.datasource.password= // Senha do usuário de Banco de Dados

Alem disso como base desse projeto está sendo utilizado o __Driver Postgresql__, se estiver ultilizando outro
altere o __pom.xml__ e adicione o seu.

### Depedency do conector do Oracle e MySql

    <dependency>
      <groupId>com.oracle.database.jdbc</groupId>
      <artifactId>ojdbc8</artifactId>
      <scope>runtime</scope>
    </dependency>
    
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <scope>runtime</scope>
    </dependency>

## Como utilizar?

Após tudo configurado sera configura um servidor TomCat na porta 8080, então acessamos pelo http://localhost:8080.  

Se a porta ja estiver em uso, altere ele com a seguinte expressão __server.port = 8089__ como exemplo.  

Adicione a expressão no __resources/templates/aplication.properties__.  

## Criar um novo Parking Spot

No canto superior direito da tela, clique no nome New Parking Control e você sera redirecionado para um formulario para realizar a inserção de uma vaga



