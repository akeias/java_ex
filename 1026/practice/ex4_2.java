package practice;

import java.util.Scanner;

public class ex4_2 {
	public static void main(String[] args) {
		int count=0; //count�� �Էµ� ������ ����
		int sum=0; // sum�� ��
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n = s.nextInt();//���� �Է�
		
		while(n!=-1) {// -1�� �ԷµǸ� while �� ���
			sum+=n;
			count++;
			n=s.nextInt(); //���� �Է�
		}
		if(count==0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.println("������ ������ "+count+"���̸�");
			System.out.println("����� "+(double)sum/count+"�Դϴ�.");
		}
		s.close();
	}

}
