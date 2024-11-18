#  Intensivão Java Spring - DSLIST
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/carlosmendesjmc/dslist/blob/main/LICENSE)) 

# Sobre o projeto

DSLIST é um projeto back-end desenvolvido como uma API Web robusta, seguindo o padrão REST, 
com foco em boas práticas de desenvolvimento, organização em camadas e integração com banco de dados. 
O objetivo é proporcionar um entendimento prático de conceitos fundamentais no desenvolvimento de APIs e sua implementação utilizando o Spring Framework.

# Conteúdos Abordados
#### Conceitos Fundamentais:
Sistemas web e recursos.
Modelo cliente/servidor, protocolo HTTP e formato JSON.
#### Padrões e Arquitetura:
Estruturação de projeto no Spring REST.
Padrão REST para APIs Web.
Padrão de camadas: Controller, Service e Repository.
Utilização de DTOs para transferência de dados.
#### Banco de Dados e ORM:
Criação de entidades e mapeamento ORM com JPA.
Configuração de relacionamentos N-N e classe de associação com EmbeddedId.
Consultas SQL no Spring Data JPA com Projections.
Seed de dados no banco (Database seeding).
#### Ambiente e Deploy:
Configuração de ambiente local com Docker Compose.
Processo de homologação e deploy com CI/CD.
Configuração de CORS para controle de acesso.
#### Desenvolvimento de Funcionalidades:
Design e implementação de endpoints RESTful.
Operações com listas e atualizações.
Uso de verbos HTTP respeitando princípios de idempotência.
 
 evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").
 ## Modelo conceitual
![Modelo Conceitual](https://github.com/carlosmendesjmc/dslist/blob/main/src/Modelo%20conceitual.png)

## Layout APi
![Api](https://github.com/carlosmendesjmc/dslist/blob/main/src/dslistAPI.png)

# Layout Banco H2

Aqui é uma amostra da API conectada com o banco de dados H2, um banco de dados relacional leve e embutido,
ideal para desenvolvimento e testes. O H2 suporta SQL padrão, permite operações in-memory ou persistência em arquivo, 
e facilita a configuração em projetos Spring devido à sua integração nativa. 
Essa configuração agiliza a validação de funcionalidades da API sem a necessidade de um banco de dados externo.

![Banco h2](https://github.com/carlosmendesjmc/dslist/blob/main/src/Banco_h2_backdslist.png)
![Banco h2](https://github.com/carlosmendesjmc/dslist/blob/main/src/Bancoh2_Backdslist.png)

## Layout Postman
O Postman é uma ferramenta popular para o desenvolvimento, teste e documentação de APIs. 
Ele oferece uma interface intuitiva para realizar requisições HTTP, facilitando a interação com serviços web durante o desenvolvimento.

![Postman](https://github.com/carlosmendesjmc/dslist/blob/main/src/Postman_Resultado_Backend_APIdslist.png)

## Layout Docker

O Docker é uma plataforma de software que permite criar, implantar e gerenciar aplicações em containers, 
um método leve e portátil de virtualização. Ele facilita a criação de ambientes isolados, 
garantindo que o software funcione de maneira consistente, independentemente do ambiente em que está sendo executado.

![Docker](https://github.com/carlosmendesjmc/dslist/blob/main/src/Subindo%20container%20no%20Docker%20.png)



## Implantação 

A Railway é uma plataforma de deploy como serviço (PaaS) que simplifica a implantação de aplicações e serviços na nuvem. 
Ela oferece uma experiência intuitiva, permitindo que desenvolvedores configurem, implantem e gerenciem projetos com facilidade.

![implantação railway](https://github.com/carlosmendesjmc/dslist/blob/main/src/implata%C3%A7%C3%A3o%20Bem%20sucedida%20Railway_Postgres.png)
![implantação railway](https://github.com/carlosmendesjmc/dslist/blob/main/src/Tabelhas%20implantadas%20na%20nuvem%20Railway.png)
![implantação railway](https://github.com/carlosmendesjmc/dslist/blob/main/src/jogo_tb.png)
![implantação railway](https://github.com/carlosmendesjmc/dslist/blob/main/src/tb_lista_de_jogos.png)
![implantação railway](https://github.com/carlosmendesjmc/dslist/blob/main/src/tb_pertencente.png)


# Tecnologias utilizadas
## Back end
##### Spring Boot
##### PostgreSQL
##### Spring Data JPA
##### REST
##### Java
##### Banco H2
##### Docke


# Autor

José Carlos Mendes Da Silva

www.linkedin.com/in/josecarlosmendesdasilva
