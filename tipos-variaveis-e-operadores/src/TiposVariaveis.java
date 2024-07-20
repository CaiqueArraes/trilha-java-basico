public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500; // dois mil e quientos em double, o sistema de números em java é americano.

        short valorCurto = 1;
        int valorNormal = valorCurto;
        short valorCurto2 = (short) valorNormal; // deveria está incorreto porque o valorcurto 2 está recebendo um valor de inteiro,(short).
        System.out.print (valorCurto2 + "\n");

        int numero = 10;
        
        numero = 50; // alterando o valor de uma variável.
        System.out.print (numero + "\n");
        
        final double VALOR_DE_PI = 3.14;  //final é usado para dizer que essa variavel não será alterada por tanto seria uma constante.
        System.out.print (VALOR_DE_PI + "\n");

        // em java temos tipos de variáves únicos da linguaguem contando com eles ao total são 8 :
        // byte, short, int, long, boolean, char, float, double.
    }
}
