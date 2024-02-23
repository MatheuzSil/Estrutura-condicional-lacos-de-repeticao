import java.util.Scanner;

public class Funcoes {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b , c);
        showResult(higher);

        sc.close();
    }
    public static int max(int x, int z, int y){
        int res;
        if (x > z && x > y){
            res = x;
        } else if (z > y) {
            res = z;
        }else{
            res = y;
        }
        return res;
    }

    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }
}
