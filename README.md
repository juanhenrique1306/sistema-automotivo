# Sistema Automotivo - Gestão de Estoque de Veículos

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.6-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Tailwind CSS](https://img.shields.io/badge/Tailwind_CSS-38B2AC?style=for-the-badge&logo=tailwind-css&logoColor=white)](https://tailwindcss.com/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)

## 📝 Sobre o Projeto
Este é um sistema completo (Fullstack) para Gestão de Estoque de Veículos e Marcas, desenvolvido como requisito prático para o curso de Programação Orientada a Objetos da UniFECAF.

O projeto consiste em uma **API REST** construída com Java e Spring Boot no back-end, um banco de dados relacional **MySQL** operando via Docker, e um **Front-end em HTML/JS** estilizado com **Tailwind CSS**. 

## ✨ Funcionalidades
* **Vitrine de Veículos:** Exibição dinâmica do estoque para clientes com interface amigável.
* **Filtros Avançados:** Busca em tempo real combinando Marca, Modelo, Ano, Cor, KM Máximo, Preço e Status (Disponível/Vendido).
* **Controle de Acesso:** Sistema de autenticação simulado (Login) separando a visão do Cliente da visão do Administrador.
* **Gestão de Marcas (CRUD):** Criação, listagem e vinculação automática das marcas no cadastro de veículos.
* **Gestão de Veículos (CRUD):** Cadastro completo (com imagens), leitura, atualização de dados restritos e exclusão definitiva do estoque.

## 🛠️ Tecnologias Utilizadas
* **Back-end:** Java 17, Spring Boot 4.0.6, Spring Data JPA, Hibernate.
* **Front-end:** HTML5, Tailwind CSS (via CDN), Vanilla JavaScript (Fetch API).
* **Banco de Dados:** MySQL 8.0.
* **Infraestrutura:** Docker & Docker Compose (para orquestração do banco).
* **IDE:** IntelliJ IDEA.

## 🚀 Como Executar o Projeto

### Pré-requisitos
* [Java JDK 17](https://adoptium.net/) instalado.
* [Docker](https://www.docker.com/products/docker-desktop) instalado e rodando.
* [Maven](https://maven.apache.org/) (embutido no IntelliJ).

### Passo a Passo

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/juanhenrique1306/sistema-automotivo.git
    cd sistema-automotivo
    ```

2.  **Suba o Banco de Dados (MySQL):**
    Na raiz do projeto, execute o comando abaixo para iniciar o container do MySQL:
    ```bash
    docker-compose up -d
    ```

3.  **Execute a Aplicação Spring Boot:**
    Pelo terminal (ou dando *Play* na classe `SistemaAutomotivoApplication` na sua IDE):
    ```bash
    ./mvnw spring-boot:run
    ```
    *O Hibernate criará as tabelas `marcas` e `veiculos` automaticamente.*

4.  **Acesse a Aplicação:**
    Abra o seu navegador e acesse:
    ```text
    http://localhost:8080
    ```

### 🔐 Credenciais de Acesso (Modo Admin)
Para gerenciar o estoque (Cadastrar, Editar, Excluir e Gerenciar Marcas), clique em **Login Restrito** no canto superior direito e utilize as credenciais:
* **Usuário:** `admin`
* **Senha:** `admin`

## 👨‍💻 Autor
Desenvolvido por **Juan Henrique**
* GitHub: [@juanhenrique1306](https://github.com/juanhenrique1306)

---
*Projeto desenvolvido para fins acadêmicos - Programação Orientada a Objetos.*
