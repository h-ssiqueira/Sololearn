import java.util.Scanner;

public class Security {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Boolean danger = false;
        char[] objs = input.toCharArray();
        for(char x : objs){
            if(x == '$' || x == 'T'){
                if(danger){
                    System.out.println("ALARM");
                    break;
                }
                else
                    danger = !danger;
            }
            if(x == 'G' && danger){
                System.out.println("quiet");
                break;
            }
        }
    }
}