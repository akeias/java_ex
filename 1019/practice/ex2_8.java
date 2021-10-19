package practice;

public class ex2_8 {

	public static void main(String[] args) {
		int a=3, b=5;
		
		System.out.println("두 수의 차는 "+((a>b)?(a-b):(b-a)));
		//조건연산자 X?Y:Z 는  조건문인 X가 true면 결과값이 Y의 값이 되고,false면 결과값이 Z의 값이 된다.
		//즉, 여기서 3인 a와 5인 b가 a>b(3>5)가 false로 나옴으로써 b-a를 실행하게된다.
	}

}
