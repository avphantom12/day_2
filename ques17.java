package abhi.tech;
import java.util.*;

public class ques17 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		 
		 System.out.print("Enter value for a: ");
	        int a = s.nextInt();
	        System.out.print("Enter value for b: ");
	        int b = s.nextInt();
	        System.out.print("Enter value for c: ");
	        int c = s.nextInt();

	        int result1 = a + b * c;
	        int result2 = a * b + c;
	        int result3 = c + a / b;
	        int result4 = a % b + c;
	        
	        System.out.println("The results of Int Operations are "+result1 +","+result2+ " ,"+result3+ " and "+result4);
	}

}
