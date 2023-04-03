package day02;

public class ForLab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenNum = 0;
		int oddNum = 0;
		for (int i = 1; i <= 99; i += 2) {
			oddNum += i;
		}
		for (int i = 2; i <= 100; i += 2) {
			evenNum += i;
		}
		System.out.println("1부터 100까지의 숫자들 중에서");
		System.out.printf("짝수의 합은 %d 이고", evenNum);
		System.out.printf("홀수의 합은 %d 이다", oddNum);
	}

}
