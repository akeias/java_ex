package practice;

import java.util.*;

public class pt6_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		
		String Words = s.nextLine();
		
		for(int i=0; i<Words.length(); i++) {
			System.out.println(Words.substring(i)+Words.substring(0, i));
		}
		System.out.println(Words);
		s.close();
	}

}
