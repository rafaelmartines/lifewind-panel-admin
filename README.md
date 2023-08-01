# Lifewind Admin Panel

O Lifewind Admin Panel foi criado no intuito de fornecer uma base de dados de plantas para serem consultadas via API pelo projeto Lifewind de autoria do [@haruwolf](http://github.com/haruwolf "@haruwolf") e [@AndreGalrao](http://github.com/AndreGalrao "@AndreGalrao") .

## 🚀 Começando

O projeto é atualmente hospedado no [Render](https://render.com/ "Render") com Docker.

### 📋 Pré-requisitos

- [JDK 17 LTS](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html "JDK 17 LTS")
- PostgreSQL, você pode baixar o [meu projeto](https://github.com/rafaelmartines/docker-compose-databases/tree/main "meu projeto") que cria contêineres com banco dados para facilitar.
- Docker - para poder testar o projeto sem precisar compilar localmente na máquina
- IntelliJ IDEA Community Edition é recomendado para compilar o projeto ou outra de preferência.

### 🔧 Instalação

* Ao compilar o projeto ele ira utilizar a porta 8080, então valide se está porta não está ocupada antes de compilar.
* Se subiu o projeto com Dockerfile.local e também utilizou o meu projeto para subir um contêiner de banco de dados PostgreSQL, no arquivo applications.properties colocar o endereço da máquina host para que os contêineres se comuniquem é possível verificar qual seu IP através do seguinte comando no shell do sistema operacional `ip config` no Windows ou `ifconfig` no Linux.

## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* [Spring Boot](https://spring.io/projects/spring-boot "Spring Boot") - Framework Web
* [Maven](https://maven.apache.org "Maven") - Gerenciamento de Dependências
* [IntelliJ IDEA (Community Edition)](https://www.jetbrains.com/idea/download/other.html "IntelliJ IDEA (Community Edition)") - IDE de Java
* [Thymeleaf](https://www.thymeleaf.org/ "Thymeleaf") - Gerenciamento de templates
