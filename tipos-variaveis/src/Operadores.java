public class Operadores {
    public static void main(String[] args) {
        
        // concatenação de duas string. Poderia ser feita também com duas variáveis.
        
        String nomeCompleto = "Linguagem" + "Java";

        System.out.println(nomeCompleto); // concatenando duas string.
        // fim.

        int a,b;
        a = 5;
        b = 6;

        String resultado = a==b ? "true" : "False"; // operador de condição ternária é uma forma resumida para definir uma condição. 

        System.out.println(resultado);
        //fim.

        int num1 = 5;
        int num2 = 6;

        boolean simNão = num1 == num2; // Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. 

        System.out.println("númeroUm é igual a númeroDois ? " + simNão);
        
        simNão = num1 != num2;

        System.out.println("númeroUm é diferente de númeroDois ? " + simNão);

        simNão = num1 > num2;

        System.out.println("númeroUm é maioir do que númeroDois ? " + simNão);

        simNão = num1 < num2;

        System.out.println("númeroUm é menor do que númeroDois ? " + simNão); 
        // fim.

        boolean condicao1 = true;

        boolean condicao2 = true; // criando expressões lógicas com os operadores lógicos &&(E) / ||(ou).

        if (condicao1 && condicao2) {
            System.err.println("As duas condiçõoes saõ verdadeiras");           
        }

        if (condicao1 || condicao2) {
            System.out.println("Umas das condições é verdadeira");
        }
        //fim
    }
}