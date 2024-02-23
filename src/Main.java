import java.util.Locale;

public class Main {

    public static  void main (String[] args){
        int y = 17;
        double x = 1.6835;
        String nome = "Matheus";
        int idade = 17;
        double renda = 14000.00;

        Locale.setDefault(Locale.US);
        System.out.println(x);
        System.out.printf("%.2f%n" , x);
        System.out.printf("%.4f%n" , x);
        System.out.println("Olá mundo");
        System.out.printf("Resultado = %.2f metros%n", x );
        System.out.printf("%s tem %d anos e ganha R$%.2f ", nome, idade, renda);

    }
}
