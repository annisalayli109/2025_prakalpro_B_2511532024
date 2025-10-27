package pekan5;

public class TugasNestedFor {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 5; j--) {
				System.out.print(".");
			}
			System.out.println(i);
			
			for (int k = 1; k < 1; k++) {
				System.out.println(".");
			}
			System.out.println();
		}

	}

}
