package practice;

import java.util.*;

public class pr9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원의 중심과 반지름을 입력>> ");
		
		double c1 = s.nextDouble();
		double c2 = s.nextDouble();
		double r = s.nextDouble();
		
		System.out.println("점 입력>> ");
		
		double x = s.nextDouble();
		double y = s.nextDouble();
		
		double d=Math.sqrt((c1-x)*(c1-x)+(c2-y)*(c2-y));
		
		if(d<r) {
			System.out.println("점 ("+x+","+y+")는 원 안에 있다.");
		}
		else {
			System.out.println("점 ("+x+","+y+")는 원 안에 없다.");
		}
		s.close();
	}

}
