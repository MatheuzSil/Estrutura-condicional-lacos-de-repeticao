import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        int soma = 0;
//
//        while (x != 0){
//            soma = soma + x;
//            x = sc.nextInt();
//        }
//
//        System.out.println(soma);



        //

//        int x = 2;
//        int y = 0;
//
//        while (x <= 60){
//            System.out.println(x);
//            x = x * 2;
//            y = y + 10;
//        }


//        double x = 50;
//        int y = 100;
//
//        while (x != y){
//            System.out.println("olha");
//            x = Math.sqrt(y);
//        }
//
//        System.out.println(x);

//        System.out.println("type your password: ");
//        int x = sc.nextInt();
//
//        while (x != 2002){
//            System.out.println("wrong password, try again");
//            x = sc.nextInt();
//
//        }
//
//        System.out.println("Access allowed");

//          int x = sc.nextInt();
//          int y = sc.nextInt();
//
//          while( x != 0 && y !=0){
//              if (x < 0 || y > 0){
//                  System.out.println("primeiro");
//              } else if (x > 0 || y < 0) {
//                  System.out.println("segundo");
//              } else if ( x > 0 || y > 0) {
//                  System.out.println("terceiro");
//
//              }else{
//                  System.out.println("quarto");
//              }
//          }

            int code = sc.nextInt();
            int gas = 0;
            int alcohol = 0;
            int diesel = 0;
            while (code > 4){
                System.out.println("This code doesn't exist");
                code = sc.nextInt();
            }
            while (code < 4){
                if (code == 1){
                    gas += 1;
                } else if (code == 2) {
                    alcohol += 1;
                }else{
                    diesel += 1;
                }
                code = sc.nextInt();
                
            }
        System.out.printf(" Thanks so much %n Alcohol: %d%n Gas: %d%n Diesel: %d%n ",alcohol, gas, diesel);
          sc.close();
    }
}
