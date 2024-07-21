## Variáveis e Constantes
Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado, define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

No Java, utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor pode variar.

Já as Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada final, seguida do tipo.

Por convenção, Constantes são sempre escritas em CAIXA ALTA.



##  Tipos Primitivos
### Os oito tipos primitivos em Java são:

int, byte, short, long, float, double, boolean e char 
esses tipos não são considerados objetos e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

Tabela de Tipos Primitivos e seus valores:

| Tipo | Memória | ValorMínimo | Valor Máximo |
|-----:|---------|-------------|--------------|
| byte | 1 byte |  -128  |  127  |
| short | 2 byte | -32.768 | 32.767 |
| int | 4 bytes| -2.147.483.648 | 2.147.483.647|
| long | 8 bytes | -9.223.372.036.854.775.808 |9.223.372.036.854.775.807|

Os tipos primitivos, que podem conter partes fracionárias podem ser representados por dois tipos:

| Tipo |Memória | Mínimo | Máximo | Precisão |
|------|--------|--------|--------|----------|
| float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 | 6 – 7 dígitos |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos |

## Operadores
### Símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.

#### Atribuição
Representado pelo símbolo de igualdade "=".

O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. em Java, definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição.

#### Aritméticos
O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).

#### Unários
Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

(-) Operador unário de valor negativo – nega um número ou expressão aritmética;

(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

(!) Operador unário lógico de negação – nega o valor de uma expressão booleana.

#### Ternário
O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:

<Expressão Condicional>`` ?``<Caso condição seja true>``:``<Caso condição seja false>

#### Relacionais
Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.

== Quando desejamos verificar se uma variável é IGUAL A outra.

!= Quando desejamos verificar se uma variável é DIFERENTE da outra.

> Quando desejamos verificar se uma variável é MAIOR QUE a outra.

>= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

< Quando desejamos verificar se uma variável é MENOR QUE outra.

<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

#### Lógicos
Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.

&& Operador Lógico "E"

|| Operador Lógico "OU"


##
