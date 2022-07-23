import java.util.Scanner;
import java.lang.*;

public class Halloween_Candy{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();
        houses = (int)(Math.ceil(2.0/houses*100));
        //your code goes here
        System.out.println(houses);
    }
}