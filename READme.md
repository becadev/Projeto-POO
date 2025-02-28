Sistema de Controle de Finanças Pessoais:

- Cadastro de receitas, despesas e categorias.
- Controle de saldo e metas financeiras.
- Geração de gráficos de gastos.


rodar aplicação maven:
cd meu-app
javac -cp .:gson-2.8.9.jar *.java
mvn clean compile
mvn exec:java -Dexec.mainClass="com.meuprojeto.App"

