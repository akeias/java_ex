package practice;

import java.util.*;

public class pr11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("달을 입력하세요.(1~12): ");
		
		int m = s.nextInt();
		
		if(3<=m&&m<=5) 
			System.out.println("봄");
		
		else if (6<=m&&m<=8) 
			System.out.println("여름");
		
		else if (9<=m&&m<=11) 
			System.out.println("가을");
		
		else if (m==12||m==1||m==2) 
			System.out.println("겨울");	
		
		else
			System.out.println("잘못 입력");
		s.close();

	}

}
