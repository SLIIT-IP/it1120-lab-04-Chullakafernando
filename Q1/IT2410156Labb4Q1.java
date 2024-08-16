import java.util.scanner;
public class IT24100156Lab4Q1{
    public static void main(Strimg[]args){
	    Scanner x = new Scanner(System.in);
	
	    System.out.print("Enter a number:");
		int number = x.nextlnt();
		
		if(number>0)
		{
		System.out.print("The number is Positive");
		}
		
		else if(number<0)
		{
		System.out.print("The number is Negative");
		}
		
		else
		{
		System.out.print("The number is zero");
		}
	}
}