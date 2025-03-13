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


