package practice;

import java.util.*;

public class ex7_3 {

	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();
		//Ű����� ���� 4���� �̸��� �Է¹޾� ArrayList�� ����
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("�̸��� �Է��ϼ���>>");
			String s = sc.next(); 
			a.add(s); //ArrayList �÷��ǿ� ����
		}
		
		//ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i=0; i<a.size(); i++) {
			//ArrayList�� i��° ���ڿ� ������
			String name = a.get(i);
			System.out.print(name+" ");
		}
		//���� �� �̸� ��� 
		int longestIndex = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(longestIndex).length()<a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n���� �� �̸��� : "+a.get(longestIndex));
		sc.close();
	}
}