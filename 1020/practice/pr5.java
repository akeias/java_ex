package practice;

import java.util.Scanner;

public class pr5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요 : ");
		
		int a= s.nextInt();
		int	b = s.nextInt();
		int	c = s.nextInt();
		
		if (a+b>c)
			if (a+c>b)
				if (b+c>a)

		System.out.println("삼각형이 됩니다.");
				else
					System.out.println("삼각형이 않됩니다.");
			else
				System.out.println("삼각형이 않됩니다.");
		else
			System.out.println("삼각형이 않됩니다.");
		
		s.close();			
	}

}
