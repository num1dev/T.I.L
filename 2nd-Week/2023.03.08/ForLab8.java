package day03;

public class ForLab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char STAR = '*';
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 10; j++) {
				System.out.print(STAR);
			}System.out.println();
		}
		
	}

}
