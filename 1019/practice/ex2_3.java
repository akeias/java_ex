package practice;

public class ex2_3 {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		System.out.println(b+i); //b가 int타입으로 자동변환
		System.out.println(10/4); //정수 나누기임으로 2까지만 출력
		System.out.println(10.0/4); //실수 나누기임으로 2.5가 출력
		System.out.println((char)0x12340041);//유니코드인듯?
		System.out.println((byte)(b+i));// b+i는 227, byte(227)는 227%256을 뺀 나머지값이다.
										// byte타입으로 강제 변환시 byte의 범위인 0~255보다 변수값이 클때 위와같이됨.					
		System.out.println((int)(2.9+1.8));//2.8+1.8=4.7에서 정수로 변환 
		System.out.println((int)2.9+1.8); //2.9를 정수로 변환 2+1.8
		System.out.println((int)2.9+(int)1.8);//2.9정수로 변환 + 1.8정수로 변환
	}
}
