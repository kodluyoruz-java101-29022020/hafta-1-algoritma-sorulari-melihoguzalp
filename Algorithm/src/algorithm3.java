import java.util.Scanner;

public class algorithm3 {
	

	public  float averageOfNumbers(int[] array) {
		
		
		
		
		int sum = 0;
		float average2 = 0.0f;
		
		for(int j =0 ; j < array.length; j ++) {
			
			
			sum = sum + array[j];
		
			
		}
		
	
		average2 = (float)sum / array.length;		
		
		return average2;
		
		
		
	}
	public static void main(String[] args) {
		
		int[] numbers = new int[3];

		Scanner scanner = new Scanner(System.in);
		
		for(int i =0 ; i < numbers.length; i ++) {
			
			
			System.out.println("Enter the elements of the array : ");
			numbers[i] = scanner.nextInt() ;
			
			
			
		}
	
		algorithm3 average = new algorithm3();
		
		System.out.println("The average is : " + average.averageOfNumbers(numbers));
		
		
	}
	

}
