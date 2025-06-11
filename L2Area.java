import java.util.Scanner;
public class L2Area{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter height:");
		double height=input.nextDouble();
		System.out.println("Enter base:");
		double base=input.nextDouble();
		double area=0.5* base * height;
		double cm=2.54*area;
		System.out.println("The Area of the triangle in sq in is " + area +" and sq cm is " + cm);
	}
}