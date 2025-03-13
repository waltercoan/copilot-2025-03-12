# Curso Copilot 12/03/2025

## Documentação do Github Copilot
[Assinaturas](https://docs.github.com/en/copilot/about-github-copilot/subscription-plans-for-github-copilot)

[OpenAI Codex](https://openai.com/index/openai-codex/)


## Configuração do Ambiente Local
[VSCode](https://code.visualstudio.com/)
[Adoptium JDK Java](https://adoptium.net/)
[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
[Github Copilot](https://marketplace.visualstudio.com/items?itemName=GitHub.copilot)


[Github Copilot WEB](https://github.com/copilot)


## Introdução ao Github Copilot
[Folha de dicas](https://docs.github.com/en/copilot/using-github-copilot/copilot-chat/github-copilot-chat-cheat-sheet?tool=vscode)

[Exemplos de Prompts](https://docs.github.com/en/copilot/using-github-copilot/copilot-chat/getting-started-with-prompts-for-copilot-chat)

### Exercicio 1 prompts
```shell
// defina um método main para esta classe
// defina um método para calcular a média de uma lista de número
// defina o código para chamar o método calcularMedia
// defina o código para imprimir a média
// define um método que recebe por parametro uma lista de nomes e imprime em tela
// defina um método que recebe por parametro uma lista de nomes e imprime em tela utilizam o método stream
```
### Exercicio 2 prompts
```shell
// definir uma função java para gerar um arquivo .csv com alguns dados dentro
// Criar um arquivo CSV com o nome especificado
// fechar o arquivo
```
```shell
gere um método que receba uma URL de uma API REST, faça um chamada HTTP e imprima o retorno em formato de texto
```
```shell
@workspace /explain  descreva o método chamarAPIRest
@workspace transforme o código do método gerarArquivoCSV para python
@workspace /explain gere a descrição no código do método chamarAPIRest
por favor adicione a dependencia do junit jupiter no arquivo pom.xml

@workspace /tests gere um teste de unidade para o método verificarParouimpar dentro do pacote de test

@workspace /fix verifique o codigo da classe de teste
```

### Exercicio 3 prompts
```shell
definir um método para criar validação para email. O método deve ser chamado validarEmail e deve receber um parâmetro do tipo String com o email a ser validado. O método deve retornar um boolean indicando se o email é válido ou não. O método main deve chamar o método validarEmail e passar o email. Ao começar a digitar a função ‘validarEmail’, o Copilot pode sugerir o uso de expressões regulares para validação.

@workspace /explain gerar uma descrição no código

gere uma validação para impedir que o código seja executado caso o parametro e-mail esteja em branco ou vazio
```

### Gerar dockerfile
```shell
@workspace gere um arquivo Dockerfile multi stage para transformar esta aplicação em uma imagem docker

@workspace /explain  #file:Dockerfile:18-18 
```
### Exercicio 4 prompts
```shell
definir um método para criar uma validação para CPF. O método deve ser chamado validarCPF
e deve receber um parâmetro do tipo String com o CPF a ser validado. O método deve retornar um
boolean indicando se o CPF é válido ou não. O método main deve chamar o método validarCPF e passar
o CPF "123.456.789-10" como parâmetro. O Copilot pode ajudar a sugerir a criação do método para
validação de CPF
```

### Exercicio 5 prompts
```shell
definir um método para gerenciar a conexão com um banco de dados SQL Server. O método deve ser
chamado conectarBanco e deve receber um parâmetro do tipo String com a URL de conexão. O método deve
retornar um objeto do tipo Connection. O método main deve chamar o método conectarBanco e passar a URL
de conexão "jdbc:sqlserver://localhost:1433;databaseName=exemplo" como parâmetro.
```

### Exercicio 5 SQL
- Tabela Usuario com os campos: nome, telefone, endereco, numero
- Tabela Publicacao com os campos: texto, usuario associado, data, numero de likes
- Tabela Comentario com os campos: publicacao associada, texto, data

```shell
@workspace #sym:### Exercicio 5 SQL por favor gere o código na linguagem SQL para o banco de dados SQL Server
```


### Exercicio 6 prompts
```shell
Crie um programa que simule o funcionamento de um caixa de supermercado. O caixa fica aberto até
o fim do expediente e pode processar a compra de vários clientes. Cada cliente pode comprar vários itens. Ao ler
cada item deve ser exibida uma mensagem para o operador do caixa perguntando se há mais itens a serem
processados. Ao final, exiba quanto a compra custou ao cliente. E então solicite do operador do caixa a
informação se deseja fechar o caixa. Encerre o algoritmo quando o usuário informar que deseja fechar o caixa
O programa deve ser composto pelos seguintes recursos:
1. Classe para representar um item do supermercado (nome e preço). Retornar 1 se `n` for 0 ou 1.
2. Classe para armazenar os itens comprados e calcular o total.
3. Classe para iniciar o programa e gerenciar o caixa.
4. Classe principal que gerencia o fluxo do caixa e interage com o operador.
```

### Exercicio 7 prompts
```shell
Neste programa, crie as classes RG, Pessoa, Professor e Aluno, que herdarão atributos e métodos da
classe abstrata Pessoa.
A – Criando a classe RG
• Crie uma classe chamada RG, com os atributos privados numero do tipo int e dataNasc do tipo String;
• Crie os métodos get e set para cada atributo;
• Crie um construtor que receba um parâmetro do tipo int e um do tipo String, e os atribua a seus
respectivos atributos;
B – Criando a classe Pessoa
Crie uma classe abstrata chamada Pessoa com os seguintes atributos:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• rg do tipo construido RG.
Crie os métodos get e set para cada atributo;
Crie um construtor que receba os parâmetros a seguir e os atribua a seus respectivos atributos:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• rg do tipo construido RG.
Crie dois métodos abstratos e nomeie-os como: falar() - que receba o parâmetro fala do tipo String, e crie,
também, o método mostrarDados();
C – Criando a classe Professor
Crie uma classe com o nome Professor, que deve ser subclasse de Pessoa;
Declare os atributos privados salario - do tipo float - e disciplina do tipo String;
Crie os métodos get e set para cada atributo;
Crie um construtor que receba os seguintes parâmetros:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• numeroRG do tipo int;
• dataNasc do tipo String;
• salario do tipo float;
• disciplina do tipo String.
Dentro do construtor, a partir do mecanismo de herança entre classes, passe os parâmetros nome, idade e o
parâmetros numeroRG e dataNasc;
Atribua os parâmetros salario e disciplina a seus respectivos atributos;
Implemente o método abstrato falar() e, dentro dele, imprima uma frase contendo o atributo nome da pessoa e
o valor do parâmetro informado;
Implemente o método abstrato mostrarDados() e, dentro dele, imprima todos os atributos da classe e da
superclasse;
D – Criando a classe Aluno
Crie uma classe com o nome Aluno, que deve ser subclasse de Pessoa;
Declare os atributos privados mensalidade, do tipo float, e curso, do tipo String;
Crie os métodos get e set para cada atributo;
Crie um construtor que receba os seguintes parâmetros:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• numeroRG do tipo int;
• dataNasc do tipo String;
• mensalidade do tipo float;
• curso do tipo String.
Dentro do construtor, a partir do mecanismo de herança entre classes, passe os parâmetros nome, idade e o
parâmetros numeroRG e dataNasc;
Atribua os parâmetros mensalidade e curso a seus respectivos atributos;
Implemente o método abstrato falar() e, dentro dele, imprima uma frase contendo o atributo nome da pessoa e
o valor do parâmetro informado;
Implemente o método abstrato mostrarDados() e, dentro dele, imprima todos os atributos da classe e da
superclasse;
E – Testando todas as classes criadas
• Crie três objetos do tipo Pessoa. Para dois objetos, utilize o construtor da classe Aluno e, para o outro,
utilize o construtor da classe Professor, passando os devidos parâmetros;
• Utilize o método falar() com cada objeto e, depois, mostre os dados de cada objeto com o método
mostrarDados();
```