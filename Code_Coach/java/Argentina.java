import java.util.Scanner;

public class Argentina{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer peso, dollar;
        peso = in.nextInt();
        dollar = in.nextInt();
        System.out.print((peso / 50) > dollar ? "Dollars" : "Pesos");
    }
}