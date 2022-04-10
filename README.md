# Parking-Control-V1
Spring Boot Parking Control.

Controle de vagas de estacionamento de uma garagem de apartamento.

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

Inicie a aplicação no arquivo ProjetoTesteApplication.java localizado no __src/main/java/br.com.gavds.www.Projeto_Teste__

Após tudo configurado sera inicializado um servidor TomCat na porta 8080, então acessamos pelo http://localhost:8080.  

Se a porta ja estiver em uso, altere a porta com a seguinte expressão __server.port = 8089__ como exemplo.  

Adicione a expressão no __resources/templates/aplication.properties__.  

## Criar um novo Parking Spot

No canto superior direito da tela, clique em __New Parking Control__ e você sera redirecionado para um formulario para realizar a inserção de uma vaga.  

<div align="center">
    <img src="https://user-images.githubusercontent.com/94410201/162633354-1865cee1-4abd-4ed2-bf83-43b52de57cce.jpeg" width="700px">
</div>

Após clicar você será redirecionado para a pagina de registro para um nova vaga de estacionamento.  

<div align="center">
    <img src="https://user-images.githubusercontent.com/94410201/162634715-aa4f19e3-0023-43e9-ac5a-41f6d7049433.jpeg" width="700px">
</div>

Para realizar o cadastro devemos seguir um padrão:  

__Parking Spot Number__ - Número da Vaga de Estacionameto  
__License Plate Car__ - Número da Placa do Carro  
__Brad Car__ - Marca do Carro  
__Model Car__ - Modelo do Carro  
__Color Car__ - Cor do Carro  
__Responsible Name__ - Nome do responsável pela Vaga  
__Apartment__ - Número do Apartamento  
__Block__ - Número do Bloco  

Exemplo:  

<div align="center">
    <img src="https://user-images.githubusercontent.com/94410201/162635114-c3093523-e9c6-41b9-8a8e-b6720e7a98c9.png" width="700px">
</div>

Para finalizar clique em __Submit__ e será cadastrado uma nova vaga, após isso você será redirecionado para o Index com os dados cadastrados sendo mostrados na tabela.

<div align="center">
    <img src="https://user-images.githubusercontent.com/94410201/162635176-5d38b968-a0a1-4128-b700-12c813a90cc0.png" width="700px">
</div>

E para excluir uma vaga de estacionamento basta clicar em __Delete__ na aba __Actions__.

<div align="center">
    <img src="https://user-images.githubusercontent.com/94410201/162635500-19cd26c4-5a0c-44c7-9f73-ce3593b38a35.png" width="700px">
</div>

Após isso a vaga será deletada do Banco de Dados e não será exibida na tela novamente.

<div align="center">
    <img src="https://user-images.githubusercontent.com/94410201/162635583-76b965a6-37d0-4493-bfa5-d4cd00807bfc.png" width="700px">
</div>
