package practice;

import java.util.Scanner;

public class pr6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1~99 ������ ������ �Է��ϼ��� : ");
		int num=s.nextInt();
		
		int a=num/10;
		int b=num%10;
		
		if (a!=0) 
			if (a%3==0)// 10�� �ڸ��� 3�ǹ���϶�
				if(b%3==0)// 1���ڸ��� 3�� �����?
					System.out.println("�ڼ�¦¦");
				else{// 1���ڸ��� 3�� ����� �ƴϸ�
					System.out.println("�ڼ�¦");
				}
			else {//10�� �ڸ��� 3�� ����� �ƴҋ�
				if (b%3==0)//1�� �ڸ��� 3�� �����?
					System.out.println("�ڼ�¦");
			}
		else {//10�� �ڸ��� 0�϶�
			if (b%3==0)
				System.out.println("�ڼ�¦");
		}						
		s.close();	
	}
}
