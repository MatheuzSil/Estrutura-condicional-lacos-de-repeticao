import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExerciciosDeCondicionais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        int number;
        System.out.println("type a number: ");
        number = sc.nextInt();
        if (number < 0){
            System.out.println("NEGATIVE");
        }else{
            System.out.println("NOT A NEGATIVE");
        }


        int number2;
        double x;

        System.out.println("type a number");
        number2 = sc.nextInt();
        if (number2 % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }

        int N1, B2;

        N1 = sc.nextInt();
        B2 = sc.nextInt();
        if (N1 % B2 == 0 || B2 % N1 == 0){
            System.out.println("MULTIPLOS");
        }else {
            System.out.println("NÃO MULTIPLOS");
        }

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");


        int item, qtd;
        System.out.println("What is the code of your order? ");
        item = sc.nextInt();
        System.out.println("How many do you want? ");
        qtd = sc.nextInt();

        double total = 0;

        if (item == 1){
            total = 4.00 * qtd;
        } else if (item == 2) {
            total = 4.50 * qtd;
        }else if (item == 3){
            total = 5.00 * qtd;
        } else if (item == 4) {
            total = 2.00 * qtd;
        }else if (item == 5){
            total = 1.50 * qtd;
        }else{
            System.out.println("This item doesn't exist");
        }
        System.out.printf("total: %.2f%n", total);


//        System.out.println("Type a number");
//        double number = sc.nextDouble();
//
//        if (number < 0 || number > 100){
//            System.out.println("Out of the Halftime");
//        } else if (number <= 25.00) {
//            System.out.println("Halftime: (0,25)");
//        } else if (number <= 50.00) {
//            System.out.println("Halftime: (25,50)");
//        } else if (number <= 75.00) {
//            System.out.println("Halftime: (50,75) ");
//        }else{
//            System.out.println("Halftime: (75,100) ");
//        }



          double salary, taxes = 0;

          salary = sc.nextDouble();

          if (salary <= 2000.00){
              System.out.println("Don't need to pay");
          }else if (salary < 3000.01) {
              taxes = (salary - 2000) * 0.08;
          } else if (salary < 4500.00) {
              taxes = (salary - 2000) * 0.18;
          }else{
              taxes = (salary - 2000) * 0.28;
          }
        System.out.printf("%.2f", taxes);

              sc.close();

    }
}
