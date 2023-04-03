package day03;

public class ForLab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char CH = '&';
		int num = (int)(Math.random()*5) + 5;
		
		for (int i = 1; i <= num; i ++) {
			for (int j = 1; j <= i; j ++) {
				System.out.print(CH);
			}System.out.println();
		}
		System.out.println(num);
	}

}
