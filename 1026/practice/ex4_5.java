package practice;

import java.util.Scanner;

public class ex4_5 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("������ 5�� �Է��ϼ���.");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = s.nextInt(); //Ű���忡�� ���� �Է�
			if(n<=0)
				continue; //����� �ƴ� ��� ���� �ݺ����� ����
			else
				sum+=n; //����� ��� ����
		}
		System.out.println("����� ���� "+sum);
		
		s.close();
	}

}
