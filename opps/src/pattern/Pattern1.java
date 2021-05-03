package pattern;

import java.util.Scanner;
public class Pattern1 {


	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
			
		int n = s.nextInt();
		
		for(int i = 1; i <= n-1; i++) {
			System.out.print("* ");
		}
		
		for(int j =0; j <= n-1; j++) {
			System.out.print("* ");
		}
		
		System.out.println();
			
			
		

	}

}
