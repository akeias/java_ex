package practice;

import java.util.Scanner;

public class pr5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ��� : ");
		
		int a= s.nextInt();
		int	b = s.nextInt();
		int	c = s.nextInt();
		
		if (a+b>c)
			if (a+c>b)
				if (b+c>a)

		System.out.println("�ﰢ���� �˴ϴ�.");
				else
					System.out.println("�ﰢ���� �ʵ˴ϴ�.");
			else
				System.out.println("�ﰢ���� �ʵ˴ϴ�.");
		else
			System.out.println("�ﰢ���� �ʵ˴ϴ�.");
		
		s.close();			
	}

}
