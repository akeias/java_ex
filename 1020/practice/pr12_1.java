package practice;

import java.util.Scanner;

public class pr12_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����>> ");
		
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
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			sum=num1/num2;
			break;
		default:
			System.out.print("��Ģ�����̾ƴմϴ�.");
		}
		System.out.println(num1+X+num2+"�� ��� ����� "+sum);
		s.close();		
		
	}

}
