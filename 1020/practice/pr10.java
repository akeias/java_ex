package practice;

import java.util.*;

public class pr10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù �� ° ���� �߽ɰ� �������� �Է�>> ");
		
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double r = s.nextDouble();
		
		System.out.println("�� �� ° ���� �߽ɰ� �������� �Է�>> ");
		
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double r1 = s.nextDouble();
		
		double d = Math.sqrt((x1-y1)*(x1-y1)+(x2-y2)*(x2-y2));
		
		if(d<=r+r1)
			System.out.println("�� ���� ���� ��ģ��.");
		else 
			System.out.println("�� ���� ���� �Ȱ�ģ��.");
		s.close();
	}

}
