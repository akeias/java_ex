package practice;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex4_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n=s.nextInt(); //���� �Է�
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				s.nextLine(); //���� �Է� ��Ʈ���� ���� �ִ� ��ū�� �����.
				i--; // �ε����� �������� �ʵ��� �̸� ����
				continue;// ���� ����
			}
			sum+=n;
		}
		System.out.println("���� "+sum);
		s.close();
	}

}
