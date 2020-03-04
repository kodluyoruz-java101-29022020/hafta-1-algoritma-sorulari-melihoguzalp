import java.util.Scanner;

public class algorithm2 {

	public static void main(String[] args) {
	
	
	System.out.println("0 - Sum of the numbers");
	System.out.println("1 - Substance of the numbers");
	System.out.println("2 - Multiply of the numbers");
	System.out.println("3 - Division of the numbers");
	
	
	
	Scanner scanner1 = new Scanner(System.in);
	System.out.println("Enter first number : ");
	int number1 = scanner1.nextInt();
	

	Scanner scanner2 = new Scanner(System.in);
	System.out.println("Enter second number : ");
	int number2 = scanner2.nextInt();
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Select an operation : ");
	int operationChoice = scanner.nextInt();
	
	System.out.println("Your choice is : " + operationChoice);
	
	switch(operationChoice) {
	
	case 0 :
		System.out.println("Sum of the numbers : " + (number1 + number2));
		break;
	
		
	case 1 :
		System.out.println("Substance of the numbers: " + (number1 - number2));

		break;	
		
		
	case 2 :
		System.out.println("Multiplication of the numbers : " + (number1 * number2));
		break;
		
		
	case 3 :

		System.out.println("Division of the numbers : " + (number1 / number2));
		break;
		
	
	default :
		System.out.println("Please select an appropriate operation.. ");
		break;
		
	}
	

	
	
		
	
	}

	}
	
