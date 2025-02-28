# Sistema de Controle de Finanças Pessoais:

- Cadastro de receitas e gastos por categoria; 
- Controle de saldo e metas financeiras.
- Geração de gráficos de gastos (Não implementado)

## Como testar:
### Abrir o diretório da aplicação
``` java
cd meu-app
```
### Compilar as classes
``` java
javac -cp .:gson-2.8.9.jar *.java
```
### Compilar projeto maven
``` java
mvn clean compile
```
### Rodar aplicação
``` java
mvn exec:java -Dexec.mainClass="com.meuprojeto.App"
```
### Diagrama de classes:
https://www.canva.com/design/DAGgWUCCQpU/AbSfvBe9_3Iv8YXysUFiGg/edit

### Considerações:
> Não houve um tratamento do arquivo json e uma formataçãõ adequada;<br>
> Não foi utilizado ferramentas da versão atual do java como stream e records devido a limitações da minha máquina;

