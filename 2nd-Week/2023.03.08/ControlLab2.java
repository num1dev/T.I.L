package day03;

public class ControlLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10) {
			i++;
			if ((i-1) % 3 != 0 && (i-1) % 4 != 0) {
				System.out.println((i-1));
			} else {
				continue;
			}
		}
	}
} 
