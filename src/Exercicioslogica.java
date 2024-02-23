//import java.util.Locale;
//import java.util.Scanner;
//
//public class Exercicioslogica {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        // EXERCÍCIO 01
//
//        int x, y, b;
//
//        System.out.print("Digite o primeiro número: ");
//        x = sc.nextInt();
//        System.out.print("Digite o segundo número: ");
//        y = sc.nextInt();
//        b = x + y;
//        System.out.println("A Soma dos dois números é: " + b);
//
//        System.out.print("Digite o primeiro número: ");
//        x = sc.nextInt();
//        System.out.print("Digite o segundo número: ");
//        y = sc.nextInt();
//        b = x - y;
//        System.out.println("the results is: "+ b) ;
//
//
////         EXERCÍCIO 02
////
////        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
////        casas decimais conforme exemplos.
////        Fórmula da área: area = π . raio2
////        Considere o valor de π = 3.14159
//
//        double x,b, y = 3.14159;
//        System.out.print("Digite o valor do raio: ");
//        x = sc.nextDouble();
//        b = y * x * x;
//        System.out.printf("A área é: %.4f%n ", b);
//
//
////         EXERCÍCIO 03
////
////        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
////        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
//
//          int a, b, c , d, x, y ;
//
//          a = sc.nextInt();
//          b = sc.nextInt();
//          c = sc.nextInt();
//          d = sc.nextInt();
//          y = c * d;
//          x = a * b  - y;
//          System.out.println("DIFERENCA = " + x);
//
//
//            // EXERCÍCIO 04
////        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
////        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
////        decimais.
//
//            int a, b ;
//            double c, x;
//
//            a = sc.nextInt();
//            b = sc.nextInt();
//            c = sc.nextDouble();
//            x = b * c;
//            System.out.printf("NUMBER = %d%nSALARY = U$%.2f%n", a ,x );
//
//            // EXERCÍCIO 05
////        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
////        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
//
//
//        int id1, q1, id2, q2;
//        double t1, t2, x, y, res;
//
//        id1 = sc.nextInt();
//        q1 = sc.nextInt();
//        t1 = sc.nextDouble();
//        id2 = sc.nextInt();
//        q2 = sc.nextInt();
//        t2 = sc.nextDouble();
//        x = t1 * q1;
//        y = t2 * q2;
//        res = y + x;
//        System.out.printf("VALOR A PAGAR: R$%.2f%n ", res);
//
//
//
//            // EXERCÍCIO 06
////        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
////        mostre:
////        a) a área do triângulo retângulo que tem A por base e C por altura.
////                b) a área do círculo de raio C. (pi = 3.14159)
////        c) a área do trapézio que tem A e B por bases e C por altura.
////        d) a área do quadrado que tem lado B.
////                e) a área do retângulo que tem lados A e B
//
//          double n1, n2, n3, x;
//
//          n1 = sc.nextDouble();
//          n2 = sc.nextDouble();
//          n3 = sc.nextDouble();
//          x  = n1 * n3 / 2.0;
//          System.out.printf("TRIANGULO:%.3f%n", x);
//          x = 3.14159 * n3 * n3;
//          System.out.printf("CIRCULO:%.3f%n", x);
//          x = (n1 + n2) * n3 / 2;
//          System.out.printf("TRAPÉZIO:%.3f%n", x );
//          x = n2 * n2;
//          System.out.printf("QUADRADO:%.3f%n", x);
//          x = n1 * n2;
//          System.out.printf("RETÂNGULO:%.3f%n", x);
//
//
//    }
//}
