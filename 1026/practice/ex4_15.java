package practice;

import java.util.Scanner;

public class ex4_15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("�������� �Է��Ͻÿ�: ");
			int dividend = s.nextInt();
			System.out.print("�������� �Է»�ÿ�: ");
			int divisor = s.nextInt();
			try {
				System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+dividend/divisor+ "�Դϴ�.");
				break; // �������� ������ �Ϸ��� while �����
			}
			catch (ArithmeticException e) { //ArithmeticException ���� ó�� �ڵ�
				System.out.println("0���� ���� ��  �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
		s.close();
	}
}
