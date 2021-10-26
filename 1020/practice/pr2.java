package practice;

import java.util.Scanner;

public class pr2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("2자리수 정수를 입력해주세요(10~99): ");
		int num=s.nextInt();
		
		int x=num/10;
		int y=num%10;
		
		if (x==y)
			System.out.println("yes! 10의 자리와 1의 자리가 같습니다!");
		else
			System.out.println("no! 10의 자리와 1의 자리가 다릅니다!");
		s.close();
				
			
	}

}
