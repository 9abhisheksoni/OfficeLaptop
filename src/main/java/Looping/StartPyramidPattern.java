package Looping;

public class StartPyramidPattern {

	public static void main(String[] args) {

		String star = "*";
		String space = " ";

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(space);
			}
			
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print(star);
			}

			System.out.println();
		}

	}
}
