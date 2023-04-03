package day02;

public class TimeTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 32150;
		System.out.printf("%d시간 %d분 %d초", time / 3600 , time / 60 % 60 , time % 60);
	}
}

