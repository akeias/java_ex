package practice;

import java.util.*;

public class pt6_7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문장을 입력하세요.");
			String Token = sc.nextLine();
			if(Token.equals("그만")) {
				System.out.println("종료합니다...");
				break;	
			}
			String[] TokenArr = Token.split(" ");
			System.out.println("어절 개수는 " + TokenArr.length);
			
		}
		sc.close();
	}

}
