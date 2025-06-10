import java.util.*;
public class selfpr1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principal=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		double si=(principal*rate*time)/100;
		System.out.print(si);
		
	}
}