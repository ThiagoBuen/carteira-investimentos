# Controle de Investimentos

Aplicação em desenvolvimento junto com o laboratório de Engenharia de Software (C214).

## Descrição

Projeto desenvolvido com a linguagem Java, utilizando a IDE Eclipse e os conceitos de POO + Engenharia de Software. 

O objetivo dessa aplicação é fazer o gerenciamento de uma carteira de investimentos!

## Funcionalidades

A aplicação contém algumas funcionalidades, como:

- [X] Cadastro de aplicações em Renda Fixa;
- [ ] Cadastro de aplicações em Renda Variável;
- [X] Gerar um arquivo de relatório no formato Json;
- [X] Gerar um arquivo de relatório no formato .CSV.

## Bibliotecas Necessárias

As seguintes bibliotecas são necessárias para a construção do projeto:

- [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)
- [OpenCSV](https://mvnrepository.com/artifact/com.opencsv/opencsv)
- [JUnit 4.12](https://mvnrepository.com/artifact/junit/junit/4.12)


## Ferramentas

As seguintes ferramentas estão sendo utilizadas para a construção do projeto:

- [Maven](http://maven.apache.org/)
- [JUnit5](https://junit.org/junit5/docs/current/user-guide/)

## Como utilizar?

### Requisitos:
- [Apache Maven 3.6.3](https://maven.apache.org/download.cgi): Maven Bin
- Java versão 11+

#### Observação: Certifique-se de ter todas as variáveis de ambiente configuradas para executar.
#### Paths a serem adicionados como variáveis de ambiente:

- Diretório da pasta __bin__ da pasta do Apache Maven.

### Clone:
- Clone este repositório na sua máquina local.
``` sh
git clone https://github.com/ThiagoBuen/carteira-investimentos.git
```

### Comandos
Dentro da pasta raiz do projeto, onde se encontra o arquivo __pom.xml__
``` sh
mvn clean package
```

Entre na pasta __target__ e execute o __.jar__
``` sh
java -jar maven-project.jar
```


