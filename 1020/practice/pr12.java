package practice;

import java.util.*;


public class pr12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����>> ");
		
		int num1 = s.nextInt();
		String X= s.next();
		int num2 = s.nextInt();
		
		
		int sum = 0;
		if (X.equals("+"))
			sum=num1+num2;
		else if (X.equals("-"))
			sum=num1-num2;
		else if (X.equals("*"))
			sum=num1*num2;
		else if (X.equals("/")) {
			if (num2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else
				sum=num1/num2;
		}
		else {
			System.out.println("��Ģ������ �ƴմϴ�.");
		}
		System.out.println(num1+X+num2+"�� ��� ����� "+sum);
		s.close();
		
	}

	
	

}
