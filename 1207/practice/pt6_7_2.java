package practice;

import java.util.*;

public class pt6_7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �Է��ϼ���.");
			String Token = sc.nextLine();
			if(Token.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;	
			}
			String[] TokenArr = Token.split(" ");
			System.out.println("���� ������ " + TokenArr.length);
			
		}
		sc.close();
	}

}
