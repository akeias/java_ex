package practice;

import java.util.Scanner;

public class pr7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	System.out.println("�� (x,y)�� ��ǥ�� �Է��ϼ��� : ");
	int x= s.nextInt();
	int y= s.nextInt();
	
	if((x>=100&&x<=200)&&(y>=100&&y<=200))
		System.out.print("("+x+","+y+")�� ����� �ȿ� �ֽ��ϴ�.");
	else
		System.out.print("("+x+","+y+")�� ����� �ȿ� �����ϴ�.");
					
	s.close();
	}
}