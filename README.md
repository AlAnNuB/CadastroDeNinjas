# CadastroDeNinjas

Uma API para cadastro e gerenciamento de ninjas, desenvolvida em **Spring Boot** como parte do curso **Java10X**.

## 📋 Sumário

- [Sobre o Projeto](#sobre-o-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Exemplos de Endpoints](#exemplos-de-endpoints)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuidores](#contribuidores)
- [Licença](#licença)

---

## 📖 Sobre o Projeto

O **CadastroDeNinjas** é uma API RESTful desenvolvida para cadastrar e gerenciar informações de "ninjas", servindo como estudo prático de Java e Spring Boot. Ele implementa banco de dados em memória, migrações com Flyway, e segue boas práticas de desenvolvimento.

---

## 💻 Tecnologias Utilizadas

- **Java 11**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (banco de dados em memória)
- **Flyway** (migrações de banco de dados)
- **Lombok** (para reduzir boilerplate)
- **Maven** (gerenciador de dependências)

---

## ⚙️ Pré-requisitos

Antes de começar, você precisará ter o seguinte instalado:

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- Uma IDE como IntelliJ IDEA ou Eclipse

---

## 🚀 Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/AlAnNuB/CadastroDeNinjas.git
   ```


2. Navegue até o diretório do projeto:

   ```bash
   cd CadastroDeNinjas
   ```
3. Instale as dependências do Maven:

   ```bash
   mvn install
   ```

4. Construa a aplicação:

   ```bash
      mvn clean install
   ```bash

5. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```
--- 

# 📄 Uso

Após iniciar a aplicação, a API estará disponível no endereço padrão:

```
http://localhost:8080
```

---

# Exemplos de Endpoints

1. Cadastrar Ninja
   **POST** `/ninjas`
   Corpo da requisição:
   ```json
      {
      "nome": "Naruto Uzumaki",
      "vila": "Konoha",
      "rank": "Genin"
      }
   ```

2. Listar Ninjas
   **GET** `/ninjas`
   Retorna uma lista de todos os ninjas cadastrados.

3. Atualizar Ninja
   **PUT** `/ninjas/{id}`

4. Excluir Ninja
   **DELETE** `/ninjas/{id}`

---

# 🌟 Funcionalidades

- Cadastrar, listar, atualizar e excluir ninjas.
- Validação de dados.
- Banco de dados em memória (H2).
- Migração de banco com Flyway.

---

# 🗂 Estrutura do Projeto

O projeto segue a estrutura padrão de um aplicativo Spring Boot:
   ```bash
   CadastroDeNinjas/
   ├── src/main/java/com/cadastrodninjas/
   │   ├── controller/   # Controladores REST
   │   ├── model/        # Entidades do banco de dados
   │   ├── repository/   # Repositórios JPA
   │   └── service/      # Lógica de negócios
   ├── src/main/resources/
   │   ├── application.properties  # Configurações da aplicação
   │   └── db/migration/           # Scripts de migração do Flyway
   ```

---

# 🤝 Contribuidores
   
[AlAnNuB](https://github.com/AlAnNuB/CadastroDeNinjas) - Desenvolvedor principal

---

# 📝 Licença

Este projeto está licenciado sob a licença **MIT**. Consulte o arquivo LICENSE para mais detalhes.

---

# 📞 Contato

Pode entrar em contato abrindo uma issue.
