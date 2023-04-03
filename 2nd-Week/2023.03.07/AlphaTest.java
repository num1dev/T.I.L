package day02;

public class AlphaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 26) + 1;
		int eng = (int) ('A');
		for (int i = 0; i < 26; i++) {
			if (num == i) {
				System.out.printf("추출된 숫자 : %d\n", i + 1);
				System.out.println((char) (eng + i));
			}
		}
	}
}
