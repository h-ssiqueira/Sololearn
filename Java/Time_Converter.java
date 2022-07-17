import java.util.Scanner;

public class Time_Converter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();

		//your code goes here
		System.out.printf("%d",days*24*60*60);
	}
}