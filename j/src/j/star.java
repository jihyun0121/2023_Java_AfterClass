package j;

public class star {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				for (int l = 0; l < j; l++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 4; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
