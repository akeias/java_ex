package practice;

import java.util.Scanner;

public class ex4_5 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = s.nextInt(); //키보드에서 정수 입력
			if(n<=0)
				continue; //양수가 아닌 경우 다음 반복으로 진행
			else
				sum+=n; //양수인 경우 덧셈
		}
		System.out.println("양수의 합은 "+sum);
		
		s.close();
	}

}
