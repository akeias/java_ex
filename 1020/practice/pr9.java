package practice;

import java.util.*;

public class pr9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �߽ɰ� �������� �Է�>> ");
		
		double c1 = s.nextDouble();
		double c2 = s.nextDouble();
		double r = s.nextDouble();
		
		System.out.println("�� �Է�>> ");
		
		double x = s.nextDouble();
		double y = s.nextDouble();
		
		double d=Math.sqrt((c1-x)*(c1-x)+(c2-y)*(c2-y));
		
		if(d<r) {
			System.out.println("�� ("+x+","+y+")�� �� �ȿ� �ִ�.");
		}
		else {
			System.out.println("�� ("+x+","+y+")�� �� �ȿ� ����.");
		}
		s.close();
	}

}
