package practice;

public class ex6_6_1101 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		int a = x1-x;
		int b = y1-y;
		int c = a*a+b*b;
		
		double num = Math.sqrt(c); // 제곱근 구하는 함수 Math.sqrt()
		
		return num;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));// 1.414213.....암튼 이렇게 출력
	}

}

