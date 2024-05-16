# API Baseada Em Microsserviços

## Material para estudo de Microsserviços e SpringBoot

  - Desenvolvida em SB 3.1 e Java 17, a API consiste em um CRUD para jogos, ainda mal finalizado, falta implementar sistema de segurança Oauth2 e conteinerização Docker.
  - API ainda em desenvolvimento, mas funcional.

## Inicie pela ordem correta dos serviços, para evitar falta de comunicação e comunicação
- São eles, respectivamente:
  - Eureka-server
  - games-gateway
  - games-config-server
  - Os demais serviços.


  
siga os Schemas do [Postman](https://github.com/OpDevInit/Spring-GamesHouse/files/15336955/Games-House.postman_collection.json) para usar os endpoints
