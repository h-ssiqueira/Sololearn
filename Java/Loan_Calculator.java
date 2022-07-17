import java.util.Scanner;

public class Loan_Calculator{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		for(int i = 3;i>0;i--){
    amount -= amount*0.1;
}
System.out.printf("%d",amount);
	}
}