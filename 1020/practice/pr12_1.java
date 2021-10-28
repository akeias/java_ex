package practice;

import java.util.Scanner;

public class pr12_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("연산>> ");
		
		int num1 = s.nextInt();
		String X= s.next();
		int num2 = s.nextInt();
		
		int sum=0;
		switch(X) {
		case "+":
			sum=num1+num2;
			break;
		case "-":
			sum=num1-num2;
			break;
		case "*":
			sum=num1*num2;
			break;
		case "/":
			if (num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			sum=num1/num2;
			break;
		default:
			System.out.print("사칙연산이아닙니다.");
		}
		System.out.println(num1+X+num2+"의 계산 결과는 "+sum);
		s.close();		
		
	}

}
