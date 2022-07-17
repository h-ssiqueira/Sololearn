import java.util.Scanner;

public class Reverse_a_String{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		//your code goes here
		for(int i =arr.length -1;i>=0;i--)
System.out.printf("%c",arr[i]);
	}
}