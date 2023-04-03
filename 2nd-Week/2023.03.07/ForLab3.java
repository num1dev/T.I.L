package day02;

public class ForLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int) (Math.random() * 10) + 1;
		int num2 = (int) (Math.random() * 11) + 30;
		int sum = 0;
		if (num1 % 2 == 0) {
			for (int i = num1; i <= num2; i += 2) {
				sum += i;
			}
		} else {
			for (int i = num1 + 1; i <= num2; i += 2) {
				sum += i;
			}
		} System.out.printf ("%d 부터 %d 까지의 짝수의 합 : %d", num1, num2, sum);

	}
}
