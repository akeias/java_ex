package practice;

import java.util.Scanner; // import�� ����� ��ĳ�ʱ���� �ִ� java.util��Ű���� ��θ� ��Ÿ��

public class ex2_4 {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		        //�� �κ��� scanner�� ������.
		
		String name = scanner.next(); //���ڿ� �б�(string)
		System.out.print("�̸��� "+name+",");
		
		String city = scanner.next(); //���ڿ� �ϱ�(string)
		System.out.print("���ô� "+city+",");
		
		int age = scanner.nextInt(); //���� �б�(int)
		System.out.print("���̴� "+age+"��,");
		
		double weight = scanner.nextDouble(); //�Ǽ� �б�(double)
		System.out.print("ü���� "+weight+"kg,");
		
		boolean isSingle = scanner.nextBoolean(); //���� �б�(boolean)
		System.out.println("���� ���δ� "+ isSingle+"�Դϴ�.");
		scanner.close(); //scanner ������
	}

}
