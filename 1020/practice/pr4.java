package practice;

import java.util.Scanner;

public class pr4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요: ");
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		int mid;
		
		if(a >b)
			if(a>c)
				if(b>c) {	
					mid=b;				
				}
				else {//b<c

					mid=c;
				}
			else {//a<c
				mid=a;

			}
		else {//a<b
			if(b>c)
				if(a>c) {
					mid=a;
				}
				else {//a<c
					mid=c;
				}
			else {//b<c
				mid=b;
			}
		}		
		System.out.println("mid는"+mid+"입니다.");
		
		scanner.close();						
	}
}
