import java.util.Scanner;
import java.math.BigDecimal;

public class Ballpark_Orders{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String order = input.nextLine();
        String[] separated = order.split(" ");
        BigDecimal total = BigDecimal.valueOf(0L);

        for(String item : separated) {
            if(item.equals("Nachos") || item.equals("Pizza"))
                total = total.add(BigDecimal.valueOf(6L));
            else if(item.equals("Cheeseburger"))
                total = total.add(BigDecimal.valueOf(10L));
            else if(item.equals("Water"))
                total = total.add(BigDecimal.valueOf(4L));
            else
                total = total.add(BigDecimal.valueOf(5L));
        }
        System.out.println(total.multiply(BigDecimal.valueOf(1.07)));
    }
}