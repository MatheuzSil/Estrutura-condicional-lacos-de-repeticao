import java.util.Scanner;

public class ExerciciosFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//
//        for(int i=1; i<=x; i++){
//            if (i % 2 != 0){
//                System.out.println(i);
//            }
//        }


//        int N = sc.nextInt();
//        int x = 0;
//        int in = 0, out = 0;
//        for (int i=0; i<N; i++){
//            x = sc.nextInt();
//            if (x >= 10 && x <= 20){
//                in += 1;
//            }else{
//                out += 1;
//            }
//        }
//
//        System.out.printf(" in: %d%n out: %d%n", in, out);

//        int N = sc.nextInt();
//        for (int i=0 ; i<N ; i++){
//            double a = sc.nextDouble();
//            double b = sc.nextDouble();
//            double c = sc.nextDouble();
//
//            double media = (a *2 + b * 3 + c *5) / 10;
//
//            System.out.println(media);
//        }

//        System.out.println("Quantas vezes vc quer dividir?");
//        int N = sc.nextInt();
//
//        for (int i=0; i<N ; i++){
//            int x = sc.nextInt();
//            int b = sc.nextInt();
//            if (b == 0){
//                System.out.println("Divisão impossível!");
//            }else{
//                double div = (double) x / b;
//                System.out.println(div);
//            }
//        }


//        int n = sc.nextInt();
//
//        int fat = 1;
//        for (int i=1; i<=n; i++) {
//            fat = fat * i;
//        }
//
//        System.out.println(fat);


//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            if (n % i == 0){
//                System.out.println(i);
//            }
//        }
//

//        int N = sc.nextInt();
//       for (int i=1; i<=N ; i++){
//           int x = i * i;
//           int y = i * i * i;
//           System.out.printf("%d %d %d%n", i, x, y);
//       }

        int retry = 0;

        do {
            System.out.print("Digite a temperatura em celsius: ");
            double tempC = sc.nextDouble();
            double tempF = tempC * 1.8 + 32;
            System.out.println("A temperatura em fahrenheit: "+ tempF);
            System.out.println("Deseja repetir(1 - sim/ 2- nao");
             retry = sc.nextInt();
        }while (retry == 1);






        sc.close();
    }
}
