package practice;

public class ex6_6_1101 {
	// �� �� (x,y)�� (x1,y1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
		int a = x1-x;
		int b = y1-y;
		int c = a*a+b*b;
		
		double num = Math.sqrt(c); // ������ ���ϴ� �Լ� Math.sqrt()
		
		return num;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));// 1.414213.....��ư �̷��� ���
	}

}

