import java.util.Scanner;


public class Binary_Converter {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
    //your code goes here
    public static class Converter{
        public static String toBinary (int n){
            String b="";
            while(n>0){
                b=(n%2)+b;
                n/=2;
            }
            return b;
        }
    }
}