package practice;

import java.util.*;

public class ex7_4 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		//iterator �� �̿��� ��� ���� ����ϱ�
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		//iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		int sum=0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ������ ���� : "+ sum);
	}
}
