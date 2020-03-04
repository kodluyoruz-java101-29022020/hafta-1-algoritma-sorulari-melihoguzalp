
public class algorithm5 {
	
	public static void main(String[] args) {
		
	
		
		int[] numbers = new int[100];
		
		
		
		
		
		for(int i = 0 ; i < numbers.length ; i++ ) {
			
			
			numbers[i] = i ;
			
						
		}
		
		
	
	
		for(int j = 0 ; j < numbers.length ; j ++) {
			
			
			if(numbers[j] % 2 == 0) {
				
				System.out.println("Even numbers :" + numbers[j]);

			}
			

		}
	
	
		for(int k = 0 ; k < numbers.length ; k ++) {
			
			
			if(numbers[k] % 2 == 1) {
				
				System.out.println("Odd numbers :" + numbers[k]);

			}
			

		}

		
		/*
		 * 	//second Way
		
		for(int number : numbers) {
			
				if(number % 2 == 0) {
				
				System.out.println("Even numbers :" + number);

			}
				
				else
					System.out.println("Odd numbers :" + number);

				
			
			
		}
		 */
		
		
	}
	
	
	

}
