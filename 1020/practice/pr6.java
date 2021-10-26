package practice;

import java.util.Scanner;

public class pr6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하세요 : ");
		int num=s.nextInt();
		
		int a=num/10;
		int b=num%10;
		
		if (a!=0) 
			if (a%3==0)// 10의 자리가 3의배수일때
				if(b%3==0)// 1의자리가 3의 배수면?
					System.out.println("박수짝짝");
				else{// 1의자리가 3의 배수가 아니면
					System.out.println("박수짝");
				}
			else {//10의 자리가 3의 배수가 아닐떄
				if (b%3==0)//1의 자리가 3의 배수면?
					System.out.println("박수짝");
			}
		else {//10의 자리가 0일때
			if (b%3==0)
				System.out.println("박수짝");
		}						
		s.close();	
	}
}
