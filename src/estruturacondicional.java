import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class estruturacondicional {

    public static void main(String[] args) {
        int x = 5;

        System.out.println("Bom Dia");

        if (x < 0) {
            System.out.println("BOA TARDE");
        }
        System.out.println("Boa noite");


          Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        if (hora <= 12) {
            System.out.println("Bom dia");

        } else if (hora < 18) {
            System.out.println("Boa tarde");

        } else if (hora >= 18) {
            System.out.println("good night");
        } else
           System.out.println("Ocorreu um erro");


//        Problema exemplo
//        Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
//        dá direito a 100 minutos de telefone. Cada minuto que exceder a
//        franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
//        quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
//        a ser pago


        int consumo;
        double conta = 50;

        consumo = sc.nextInt();
        if (consumo > 100){
            conta += (consumo - 100) * 2;
        }

        System.out.printf("you must to pay: %.2f", conta );

        sc.close();
    }
    }
