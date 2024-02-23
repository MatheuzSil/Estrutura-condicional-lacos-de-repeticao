import java.util.Locale;
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        System.out.print("send anything: ");
        x = sc.next();
        System.out.println("you sended : "  + x);

        int y;
        System.out.print ("Digit a number: ");
        y = sc.nextInt();
        System.out.println("you sended the number: " + y);

        double b ;
        System.out.print("Qual é a média?: ");
        b = sc.nextDouble();
        System.out.printf("a média é : %.2f%n", b);

        char k;

        System.out.println("Digite: ");
        k = sc.next().charAt(0);
        System.out.println("A letra é: " + k);

        //para ler um texto até a quebra de linha

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }
}

