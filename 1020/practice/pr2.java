package practice;

import java.util.Scanner;

public class pr2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("2�ڸ��� ������ �Է����ּ���(10~99): ");
		int num=s.nextInt();
		
		int x=num/10;
		int y=num%10;
		
		if (x==y)
			System.out.println("yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�!");
		else
			System.out.println("no! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�!");
		s.close();
				
			
	}

}
