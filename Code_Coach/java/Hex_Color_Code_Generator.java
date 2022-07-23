import java.util.Scanner;

public class Hex_Color_Code_Generator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer r = in.nextInt(),g = in.nextInt(),b = in.nextInt();
        System.out.println("#"+decToHex(r)+decToHex(g)+decToHex(b));
    }

    private static String decToHex(Integer num){
        return decode(num/16)+decode(num%16);
    }

    private static String decode(Integer x){
        switch(x){
            case 10: return "a";
            case 11: return "b";
            case 12: return "c";
            case 13: return "d";
            case 14: return "e";
            case 15: return "f";
            default: return String.valueOf(x);
        }
    }
}