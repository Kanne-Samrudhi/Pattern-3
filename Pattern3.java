package comm;


	import java.util.Scanner;
	public class Pattern3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Taking user input for the number of rows
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();

	        for (int i = 0; i < n; i++) {
	            // Print leading spaces
	            for (int j = 0; j < i; j++) {
	                System.out.print("   "); // 3 spaces for indentation
	            }

	            // Print alternating 0s and 1s based on the row index
	            int num = i % 2;

	            // Print the number decreasing by one each row
	            for (int j = 0; j < n - i; j++) {
	                System.out.print(num + " ");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


