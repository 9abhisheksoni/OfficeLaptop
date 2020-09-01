package Looping;

public class StartPyramid_Gap {

	public static void main(String[] args) {
		String space = " ";
		String star = "* ";
		int n = 4;

		for (int i = 1; i <= n; i++) {

			for (int j = n - 1; j >= i; j--) {

				System.out.print(space);
			}		
			
			for(int k = 1; k<=i; k++ ) {
				System.out.print(star);
			}
			
			System.out.println();
		}
	}
}
