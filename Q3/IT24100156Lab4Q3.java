import java.util.Scanner;
public class IT24100156Lab4Q3{
	public static void main(String[]args){
		Scanner y = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = y.nextInt();
		
		
		String answer=(number>0)?"The number is positive"
		:(number<0)?"The number is negative"
		:"The number is Zero";
		
		
		System.out.print(answer);
	}
}