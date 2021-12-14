package practice;

import java.util.*;

public class ex7_6 {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 70);
		scoreMap.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� : "+scoreMap.size());
		
		//��� ����� ���� ���
		Set<String> keys = scoreMap.keySet(); //��� Key�� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator(); //Set�� �ִ� ��� Key�� ������� �˻��ϴ� Iterator ����
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
	}

}
