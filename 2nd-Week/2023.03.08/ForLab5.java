package day03;

public class ForLab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int) (Math.random() * 8) + 3;
		int num2 = (int) (Math.random() * 3) + 1;
		char result = '*';
		switch (num2) {
		case 1:
			result = '*';
			break;
		case 2:
			result = '$';
			break;
		case 3:
			result = '#';
			break;

		}
		for (int i = 1; i <= num1; i++) {
			System.out.print(result + " ");
		}
	}
}
