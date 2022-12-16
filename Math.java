import java.util.Scanner;

abstract class Calculate{
	double x,y,result;
	abstract void calc();
}

class Addition extends Calculate{
	void calc(){
		System.out.println("Enter two numbers for addition : ");
		Scanner SS = new Scanner(System.in);
		x = SS.nextDouble();
		y = SS.nextDouble();
		result = x + y;
		System.out.println("Addition of " + x + " and "+ y + " is : " + result);
		}
	Addition(){}
}

class Subtraction extends Calculate{
	void calc(){
		System.out.println("Enter two numbers x and y for subtraction : ");
		Scanner SS = new Scanner(System.in);
		x = SS.nextDouble();
		y = SS.nextDouble();
		result = x - y;
		System.out.println("Subtraction of " + x + " and "+ y +  " is : " + result);
		}
	Subtraction(){}
}

class Multiplication extends Calculate{
	void calc(){
		System.out.println("Enter two numbers x and y for multiplication : ");
		Scanner SS = new Scanner(System.in);
		x = SS.nextDouble();
		y = SS.nextDouble();
		result = x * y;
		System.out.println("Multiplication of " + x + " and "+ y +  " is : " + result);
		}
	Multiplication(){}
}

class Division extends Calculate{
	void calc(){
		System.out.println("Enter two numbers x and y for dividion : ");
		Scanner SS = new Scanner(System.in);
		x = SS.nextDouble();
		y = SS.nextDouble();
		if (y==0){
			System.out.println("ZERO NOT ALLOWED!");
			return;
		}
		result = x / y;
		System.out.println("Division of " + x + " and "+ y + " is : " + result);
		}
	Division(){}
}

class Three{
	public static void main(String XX[]){
		
		int choice, x=0;
		Scanner SS = new Scanner(System.in);
		while (x==0){

			System.out.println("1:Add 2:Subtract 3:Multiply 4:Divide 5:Exit");
			choice = SS.nextInt();
			switch (choice) {
			case 1:Addition A = new Addition();
			A.calc();
			break;

			case 2:Subtraction S = new Subtraction();
			S.calc();
			break;

			case 3:Multiplication M = new Multiplication();
			M.calc();
			break;

			case 4:Division D = new Division();
			D.calc();
			break;
			
			case 5:x=1;
			break;

			default:System.out.println("Enter a valid choice");
			break;
			}
			
		}
	}
}
		