package practice;

import java.util.Scanner;

public class ex4_14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dividend; //������
		int divisor; // ������
		
		System.out.print("�������� �Է��Ͻÿ�: ");
		dividend = s.nextInt();
		System.out.print("�������� �Է»�ÿ�: ");
		divisor = s.nextInt();
		System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+dividend/divisor+ "�Դϴ�.");
		s.close();
	}

}
