package practice;

import java.util.Scanner;

public class ex4_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.print(">>");
			String text = s.nextLine(); //�� ���� �б�
			if(text.equals("exit")) // "exit"�� �ԷµǸ� �ݺ� ����
				break; // while���� ���
		}
		System.out.println("�����մϴ�...");
		s.close();
	}

}
