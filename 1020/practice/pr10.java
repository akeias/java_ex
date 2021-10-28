package practice;

import java.util.*;

public class pr10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번 째 원의 중심과 반지름을 입력>> ");
		
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double r = s.nextDouble();
		
		System.out.println("두 번 째 원의 중심과 반지름을 입력>> ");
		
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double r1 = s.nextDouble();
		
		double d = Math.sqrt((x1-y1)*(x1-y1)+(x2-y2)*(x2-y2));
		
		if(d<=r+r1)
			System.out.println("두 원은 서로 겹친다.");
		else 
			System.out.println("두 원은 서로 안겹친다.");
		s.close();
	}

}
