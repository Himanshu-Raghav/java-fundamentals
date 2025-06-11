import java.util.Scanner;
public class L2Calculator{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number 1:");
		float number1=input.nextFloat();
		System.out.println("Enter number 2:");
		float number2=input.nextFloat();
		float addition=number1+number2;
		float subtraction=number1-number2;
		float multiplication=number1*number2;
		float division=number1/number2;
		System.out.print("the addition, subtraction, multiplication, and division value of 2 numbers " + number1 +" and " + number2 +" is "+ addition +" , "+subtraction+" , "+multiplication+" and "+division);	
	}
}