package arithmethicsystem;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  
	  System.out.println("++++++=====WELCOME=====++++++");
	  System.out.print("Enter number1:");
	  Aritmethic.number1 = scan.nextFloat();
	  System.out.print("Enter number2:");
	  Aritmethic.number2 = scan.nextFloat();
	  
	  
	  Addition addition = new Addition();
	  addition.Operation();
	  Subtraction subtract = new Subtraction();
	  subtract.Operation();
		 
		 
     
	  scan.close();
	} 

}
