package day03;

public class ControlLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		while (true) {
			int num = (int)(Math.random() * 10) + 10;

			if (num % 3 == 0 || num % 5 == 0) {
				for (int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.println(sum);
				
			} else if (num == 11 || num == 17 || num == 19) {
				break;

			} else {
				System.out.println("재수행");
			}count++;
		}
		System.out.printf("%d회 반복함", count);
	}
}
