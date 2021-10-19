package practice;

public class ex2_2 {	

	public static void main(String[] args) {
		final double PI = 3.14; //final 상수 선언자,final을 사용하면 값을 바꿀수 없음.
		
		double radius = 10.0;
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 ="+circleArea); //여기서 +는 연결자로써 원의면적= 과 circleArea값을 연결해서 하나의 문장으로 만들어줌.
	}
}
