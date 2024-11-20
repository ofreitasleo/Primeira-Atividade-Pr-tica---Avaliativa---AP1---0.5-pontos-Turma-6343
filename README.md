# Primeira-Atividade-Prática---Avaliativa---AP1---0.5-pontos-Turma-6343

Passos para Executar as Tarefas:

a) Verifique se possui o Java instalado no seu computador. Digite no terminal ou prompt de comando: java -version

  Se o Java não estiver instalado, você deve baixá-lo.
b) Abra o terminal ou prompt de comando e navegue até o diretório onde o arquivo Java que você deseja abrir foi salvo.

d) Compile o código com o comando: javac arquivo.java

  Este comando irá gerar o arquivo arquivo.class, que é o bytecode do programa.
e) Para executar o programa, digite o seguinte comando:

  java arquivo
Tarefa 01 - Calculadora de Desconto

Descrição do Programa:
Este programa é uma calculadora de desconto simples que:

Solicita o valor de um produto.
Solicita a porcentagem de desconto.
Calcula o valor do desconto e exibe o preço final do produto após aplicar o desconto.
Explicação do Código
Utilizei a classe Scanner para ler o valor do produto e a porcentagem de desconto fornecidos pelo usuário.
Cálculos:

O valor do desconto é calculado multiplicando o valor do produto pela porcentagem de desconto e dividindo por 100.
O preço final do produto é obtido subtraindo o valor do desconto do valor original.
Saída:
O programa imprime o valor do desconto e o preço final do produto com 2 casas decimais.
O método scanner.close() é utilizado para fechar o scanner após o uso.
Interação com o Usuário:
O programa irá solicitar que você insira o valor do produto e a porcentagem de desconto.
O programa calculará o valor do desconto e o preço final do produto, exibindo essas informações na tela.

Observações:
Certifique-se de inserir os valores corretamente. O programa não fará verificações para garantir que o valor do produto ou a porcentagem sejam números válidos. Portanto, insira valores numéricos válidos para evitar erros de execução.
Caso deseje utilizar outra porcentagem de desconto ou valor de produto, basta executar novamente o programa.

Tarefa 02 - Calculadora de ITBI

Descrição do Programa:
O programa Calculadora de ITBI é uma ferramenta simples que calcula o valor do imposto ITBI a ser pago na compra de um imóvel.

Explicação do Código
Utilizei JOptionPane.showInputDialog para capturar os valores inseridos pelo usuário para a transação;
Os dados são recebidos como String e convertidos para double usando Double.parseDouble().
Cálculo:
Calculei o maior valor entre o valor da transação e o valor venal utilizando a função Math.max().
O imposto ITBI é então calculado com base nesse valor máximo, multiplicando pela porcentagem fornecida e dividindo por 100.
O resultado é exibido com JOptionPane.showMessageDialog, onde mostramos o valor de base do ITBI (o maior entre o valor de transação e o valor venal) e o valor do imposto calculado.

Interação com Usuário:
Ao executar o programa, aparecerão três caixas de entrada para inserir as seguintes informações:
a) O valor da transação do imóvel.
b) O valor venal do imóvel.
c) A porcentagem do imposto ITBI.
O programa irá calcular e exibir uma janela com o valor da base de cálculo do ITBI e o valor do imposto a ser pago.

Tarefa 03 - Sistema de Avaliação

Descrição do Programa:
O programa Sistema de Avaliação é um sistema simples que utiliza as notas disponibilizadas para fazer o cálculo da nota final do aluno e determinar se ele está aprovado ou reprovado

Explicação do Código
Utilizei JOptionPane.showInputDialog para pegar as notas das duas provas e do trabalho fornecidas pelo usuário.
Os valores são recebidos como Strings e depois convertidos para double utilizando Double.parseDouble().
A média é calculada somando as notas das provas e do trabalho e dividindo o total por 3
A aprovação é determinada por meio de uma expressão condicional simples. Se a média for maior ou igual a 6, o aluno está Aprovado. Caso contrário, ele está Reprovado.
O resultado (média e situação do aluno) é mostrado ao usuário utilizando JOptionPane.showMessageDialog.

Interação com Usuário

O programa solicitará que o usuário insira as notas de duas provas e de um trabalho.
Após inserir as notas, ele calculará a média e informará se o aluno foi aprovado ou reprovado.
Entrada de Dados com JOptionPane:
O programa usa JOptionPane.showInputDialog para capturar os dados do usuário: idade, sexo (M ou F) e anos de contribuição.
Esses valores são convertidos para os tipos apropriados (int para idade e anos de contribuição, e char para o sexo).
Regras de Aposentadoria:

A idade de aposentadoria é definida para 65 anos para homens e 62 anos para mulheres.
O tempo de contribuição necessário é de 35 anos para homens e 30 anos para mulheres.
Lógica de Aposentadoria:

O programa verifica se o usuário atende às condições para se aposentar, tanto por idade quanto por tempo de contribuição.
Caso o usuário já possa se aposentar, uma mensagem informando isso é exibida. Caso contrário, o programa calcula quantos anos faltam para o usuário atingir as condições necessárias.
Exibição do Resultado:

O resultado é exibido ao usuário usando JOptionPane.showMessageDialog, informando se ele já pode se aposentar ou quantos anos faltam para atingir os requisitos.

Tarefa 04 - Calculadora de Aposentadoria

Descrição do Programa
Calculadora de Aposentadoria é um sistema que utiliza o sexo do usuário e sua idade e os anos de contribuição para determinar se o mesmo já tem idade para se aposentar ou não

Explicação do Código
O programa usa JOptionPane.showInputDialog para capturar os dados do usuário: idade, sexo (M ou F) e anos de contribuição.
Esses valores são convertidos para os tipos apropriados (int para idade e anos de contribuição, e char para o sexo).

Regras de Aposentadoria:
A idade de aposentadoria é definida para 65 anos para homens e 62 anos para mulheres.
O tempo de contribuição necessário é de 35 anos para homens e 30 anos para mulheres.
O programa verifica se o usuário atende às condições para se aposentar, tanto por idade quanto por tempo de contribuição.
Caso o usuário já possa se aposentar, uma mensagem informando isso é exibida. Caso contrário, o programa calcula quantos anos faltam para o usuário atingir as condições necessárias.
O resultado é exibido ao usuário usando JOptionPane.showMessageDialog, informando se ele já pode se aposentar ou quantos anos faltam para atingir os requisitos.

Interação com Usuário
O programa solicitará que o usuário insira sua idade, sexo e anos de contribuição.
Com base nas entradas, ele calculará se o usuário já pode se aposentar ou quantos anos faltam para ele atingir as condições de aposentadoria.
Tarefa 05 - Circuito de Resistências

Descrição do Programa
Circuito de Resistência é um sistema que solicita o valor de 4 resitencias para calcular o valo total da resistencia

Explicação do Código
Entrada de Dados com JOptionPane:
O programa usa JOptionPane.showInputDialog para capturar os valores das quatro resistências (R1, R2, R3, R4) fornecidos pelo usuário.
Esses valores são recebidos como Strings e convertidos para double usando Double.parseDouble().
Quando resistências estão ligadas em série, a resistência equivalente é dada pela soma das resistências:
O programa usa as funções Math.max() e Math.min() para determinar a maior e a menor resistência entre as quatro resistências fornecidas.
O resultado da resistência equivalente, da maior resistência e da menor resistência é exibido usando JOptionPane.showMessageDialog

Interação com o Usuário

O programa solicitará que o usuário insira os valores das quatro resistências.
Ele calculará e exibirá a resistência equivalente, a maior e a menor resistência.
Tarefa 06 - Sistema de Login

Descrição do Programa
Sistema de Login pede login e senha para o usuário, que possui até 3 tentativas para acertar Login e senha.

Explicação do Código
O código define as variáveis loginCorreto e senhaCorreta com o valor "java8", que será o valor correto para o login e senha.
O programa utiliza JOptionPane.showInputDialog para solicitar ao usuário que insira seu login e senha.
O programa compara os valores inseridos com os valores predefinidos ("java8").
O usuário tem 3 tentativas para inserir o login e a senha corretos. A cada falha, o contador tentativas é incrementado.
Se o login ou senha estiverem errados, uma mensagem de erro é exibida, informando o número de tentativas restantes.
Se o usuário inserir o login e a senha corretos, o programa exibe uma mensagem de boas-vindas e encerra o programa.
Se o usuário falhar nas 3 tentativas, o programa exibe uma mensagem informando que o número máximo de tentativas foi alcançado e bloqueia o acesso.

Interação com o Usuário:

O programa solicitará que o usuário insira o login e a senha.
Caso o usuário insira os dados corretos ("java8"), ele terá acesso ao sistema. Se ele errar, terá 3 tentativas e receberá mensagens informativas.
Tarefa 07 - Gerador de Tabuada

Descrição do Programa
O Programa recebe um número e o sistema gera a tabuada do 1 ao 10 desse número

Explicação do Código
O programa solicita ao usuário que insira um número usando o JOptionPane.showInputDialog, que captura a entrada como uma String.
Em seguida, a entrada é convertida para um número inteiro utilizando Integer.parseInt().
Um loop for é usado para percorrer os números de 1 a 10.
Para cada valor de i (que vai de 1 a 10), o programa calcula o produto do número informado pelo usuário e i.
O resultado é concatenado em uma variável StringBuilder, que armazena a tabuada completa.
A tabuada é exibida em uma caixa de diálogo usando JOptionPane.showMessageDialog, que apresenta o texto gerado no loop.

Interação com o Usuário

O programa solicitará que o usuário insira um número.
Após inserir o número, a tabuada será gerada de 1 a 10 e exibida ao usuário.
