package practice;

import java.util.Scanner;

public class pr1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("��ȭ�� �Է��ϼ���(���� ��): ");
		int won= s.nextInt();
		double dollor;
		dollor=won/1100;
		System.out.println(won+"���� $"+dollor+"�Դϴ�.");
		
		s.close();
	}

}
