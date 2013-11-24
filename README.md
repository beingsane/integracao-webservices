integracao-webservices
======================

Repositório para integração de aplicações utilizando webservices, com: 
Jax-WS, JavaEE 7, GlassFish 4, CDI, Weld, JPA2.1, Hibernate3 e MySQL

Neste trabalho, resolvemos problemas como:
1. Injeção de dependências em webserices
2. Deploy de webservices no GlassFish 4
3. Desenvolvimento de cliente para consumo d eserviços
4. Controle de conexão com banco de dados usando @Produces e @Disposes
5. Log baseado em Log4j
6. Desenho de Fachada da camada de Modelo, para diminuição de acoplamento
7. Uso de DAO Genérico

Ambiente de desenvolvimento utilizado:

Linux Mint
JDK 7
Eclipse JEE Kepler
GlassFish 4 (implementa JEE 7)
MySQL 5.5

Para rodar o projeto, você precisa, ainda, baixar:
1. Arquivos .jar do hibernate (http://hibernate.org/downloads)
2. Driver JDBC para o MySQL (http://dev.mysql.com/downloads/connector/j)
