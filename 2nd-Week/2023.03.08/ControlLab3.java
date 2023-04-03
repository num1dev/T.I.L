package day03;

public class ControlLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = " ";
		while(true) {
			int num = (int)(Math.random()*120)+1;
			if (num < 50) {
				S = "50 미만";
				if (num % 10 == 3) {
					S = "*듀크팀*";
				}
			}else if (num >= 50 && num <=80 ) {
				S = "50 이상 80 이하";
				if (num >= 70 && num < 80) {
					S = "*턱시팀*";
				}
			}else if (num >= 81 && num <= 100) {
				continue;
			}else {
				break;
			}System.out.printf("%d : %s\n", num, S);
		}
	}

}
