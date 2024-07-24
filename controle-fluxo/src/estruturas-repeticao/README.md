## Estruturas de repetição
Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

Laços ou repetições são representados pelas seguintes estruturas:

For (para);

While (enquanto);

Do While (faça enquanto).

### For
O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.

estrutura do controle de fluxo for

**for (bloco de inicialização; expressão booleana de validação; bloco de atualização)**
<br>
{
    comando que será executado até que a 
    expressão de validação torne-se falsa 
}

### While
O laço while (na tradução literal para a língua portuguesa “enquanto”) determina que, enquanto uma condição for válida, o bloco de código será executado. O laço 
while, testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

**while (expressão booleana de validação)**
<br>
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}

### Do While
O laço **do / while** (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que, enquanto uma determinada condição for válida, o bloco de código será executado. Entretanto, **do / while** testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida, no primeiro teste o bloco será executado pelo menos uma vez.

**do**
<br>
{
    comando que será executado até que a 
    expressão de validação torne-se falsa 
}
<br>

**while (expressão booleana de validação)**