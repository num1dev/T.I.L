package day02;

public class SwitchLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = (int)(Math.random()*6) + 1;
		switch( grade ) {
		case 1 :
			System.out.println(grade + "학년은 저학년입니다.");
			break;
		case 2:
			System.out.println(grade + "학년은 저학년입니다.");
			break;
		case 3 :
			System.out.println(grade + "학년은 저학년입니다.");
			break;
		case 4 :
			System.out.println(grade + "학년은 고학년입니다.");
			break;
		case 5:
			System.out.println(grade + "학년은 고학년입니다.");
			break;
		case 6 :
			System.out.println(grade + "학년은 고학년입니다.");
			break;	
			
		}
	}

}
