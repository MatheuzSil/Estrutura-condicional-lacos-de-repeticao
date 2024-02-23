public class Ifternario {

    public static void main(String[] args) {


        double price = 34.5;
        double desconto = (price <= 20.00) ? price * 0.1 : price * 0.05;

        System.out.println(desconto);
    }
}
