package practice;

public class ex4_3 {
	public static void main(String[] args) {
		char c='a';
		
		do {
			System.out.print(c);
			c = (char)(c+1);//������ ��� 1�� ���ϸ� ���� ������ �ڵ� ��
		}while (c<='z');
		
	}

}