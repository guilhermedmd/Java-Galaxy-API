# Galaxy API 🌎🌠🌙⭐

A galaxy API é uma API desenvolvida com em Java utilizando Springboot, o gerenciador de dependências Maven, Spring data JPA e o banco de dados H2. 

## Funcionamento
A Galaxy API foi desenvolvida para fins de estudo, seu funcionamento gira em torno de mapear formas de vida e seus respetivos planetas, por meio das classes Planetas e Forma de Vida.
<br>
<br>
Além disso, o projeto conta com o uso da API Le-Systeme (https://api.le-systeme-solaire.net/en/), uma API que disponibiliza informações sobre os planetas. Por meio dela, com base no nome do planeta é feita a requisição a Le-Systeme que retorna as informações daquele planeta, para que isso seja possível foi necessário o uso do OpenFeign.

A documentação do projeto foi feita com auxílio do Swagger, que ao rodar o servidor de forma local disponibiliza as seguintes URL para acesso:
```bash
  http://localhost:8080/swagger-ui/index.html#/
  ```
  
Caso queira acessar por meio de um serviço de API Client como Postman use as URIs:
```bash
- http://localhost:8080/planeta
```
```bash
http://localhost:8080/formadevida
```
Cada URI seja de planeta ou forma de vida possui os mesmos endpoints:
- /1 -> Para adicionar um novo planeta ou forma de vida
- /2/{id do planeta ou da forma de vida} -> Para editar os dados de um planeta ou de uma forma de vida
- /3 -> irá exibir todas as formas de vidas ou planetas cadastrados no banco de dados
- /4/{id do planeta ou da forma de vida} -> Exibe os dados do planeta ou da forma de vida com base no id
- /5/{id do planeta ou da forma de vida} -> Deleta a forma de vida ou o planeta com base no id
  
##
<div align = center>
<img height = 90px weight =80px src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" />
<img  height = 90px weight =80px src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/maven/maven-original.svg" />
<img  height = 90px weight =80px src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original-wordmark.svg" />
</div>
          
          
          

