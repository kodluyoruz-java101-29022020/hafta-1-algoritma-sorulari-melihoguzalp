
import java.util.Scanner;

public class algorithm1 {
	
	public static void main(String[] args) {
		
	
		   String password = "123";
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter a number : ");

            Integer operationNumber = scanner.nextInt();

            if(operationNumber.toString().equals(password)){

                System.out.println("Succesfully entered..");

            }
            else {
                System.out.println("Your attempt is failed..");
            }



}
}