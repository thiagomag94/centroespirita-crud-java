# centroespirita-crud-java

# Acervo

## Descrição
O projeto **Acervo** é uma aplicação web desenvolvida para o projeto de extensão da Estácio, utilizando Spring Boot para gerenciar o acervo de livros de um centro espírita. A aplicação permite o registro, atualização, deleção e consulta de livros em uma base de dados MongoDB.

## Estrutura do Projeto

```
book-acervo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── acervo/
│   │   │           ├── controller/
│   │   │           │   └── LivroController.java
│   │   │           ├── model/
│   │   │           │   └── Livro.java
│   │   │           ├── repository/
│   │   │           │   └── LivroRepository.java
│   │   │           └── AcervoApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       ├── templates/
│   │       └── META-INF/
├── pom.xml
└── README.md
```

## Tecnologias Utilizadas
- **Spring Boot**: Framework para criação da aplicação.
- **MongoDB**: Banco de dados NoSQL para armazenamento dos livros.
- **Maven**: Ferramenta de automação de compilação utilizada para gerenciar dependências e empacotar a aplicação.
- **Lombok**: Biblioteca para simplificar o código Java.

## Dependências
As principais dependências do projeto, conforme descrito no arquivo `pom.xml`, incluem:
- `spring-boot-starter-data-mongodb`
- `spring-boot-starter-web`
- `spring-boot-devtools`
- `lombok`
- `spring-boot-starter-test`
- `spring-boot-starter-actuator`

## Configuração
### 1. Clonar o Repositório
```bash
git clone https://github.com/seu-usuario/acervo.git
cd acervo
```

### 2. Configurar o MongoDB
Certifique-se de ter o MongoDB instalado e em execução na porta padrão (`27017`). Caso queira alterar a configuração, modifique o arquivo `src/main/resources/application.properties`.

### 3. Executar a Aplicação
Para rodar a aplicação localmente, utilize o Maven:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## Autor
Desenvolvido por Thiago Borges Miranda.

## Licença
Este projeto está licenciado sob a Apache License 2.0.

