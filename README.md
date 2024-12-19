# springboot
Atividade de API CRUD com  Maven, PostgreSQL, Flyway e Spring Boot

# Cliente API

Este projeto é uma API CRUD (Create, Read, Update, Delete) desenvolvida com Spring Boot, utilizando PostgreSQL como banco de dados e Flyway para gerenciamento de migrações de banco de dados.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.1.6**
- **PostgreSQL 42.5.4**
- **Flyway 9.22.1**
- **Maven**

## Funcionalidades

- Criar um novo cliente
- Listar todos os clientes
- Buscar um cliente por ID
- Atualizar informações de um cliente
- Deletar um cliente




## Configuração do Ambiente

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/MariaEduarda0603/springboot.git
   cd springboot
   
**Configure o banco de dados PostgreSQL:**

Crie um banco de dados para a aplicação.
Atualize as configurações de conexão no arquivo application.properties.

**Execute as migrações do Flyway:**

As migrações do Flyway serão executadas automaticamente na inicialização da aplicação.

2. **Execute a aplicação:**

   ```bash
mvn spring-boot:run


**Endpoints da API**
GET /api/clientes: Retorna todos os clientes.
GET /api/clientes/{id}: Retorna um cliente específico pelo ID.
POST /api/clientes: Cria um novo cliente.
PUT /api/clientes/{id}: Atualiza um cliente existente.
DELETE /api/clientes/{id}: Deleta um cliente pelo ID.



- Adicione ou remova seções conforme necessário para refletir com precisão o seu projeto.

Sinta-se à vontade para modificar o conteúdo conforme necessário! Se pr
