import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);		
	System.out.println("Enter the numbers");
	int a=scanner.nextInt();
	int b= scanner.nextInt();
	
	System.out.println("What method do you want to use? Enter 1 for addition, 2 for Subtraction,3 for Mutl, 4 for Division ");
	int decision= scanner.nextInt();	
	if (decision==1) {
		System.out.println(add(a,b));
		
		} else if (decision==2) {
			System.out.println(sub(a,b));
			
		} else if (decision==3) {
			System.out.println(mutl(a,b));
			
		}else if (decision==4) {
			System.out.println(divi(a,b));
		}else {
			System.out.println("Nothing");
		}
		
	
	}
	public static int add(int a ,int b) {
	int sum1=a + b;
	return sum1;
}
	public static int sub(int a ,int b) {
		int sum2= a -b;
		return  sum2;
	}
	public static double mutl(int a ,int b) {
		double sum3= a * b;
		return sum3;
	}
		
	public static double divi(int a ,int b) {
double  sum4=a / b;
	return sum4;
}
}