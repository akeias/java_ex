package practice;

public class ex2_3 {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		System.out.println(b+i); //b�� intŸ������ �ڵ���ȯ
		System.out.println(10/4); //���� ������������ 2������ ���
		System.out.println(10.0/4); //�Ǽ� ������������ 2.5�� ���
		System.out.println((char)0x12340041);//�����ڵ��ε�?
		System.out.println((byte)(b+i));// b+i�� 227, byte(227)�� 227%256�� �� ���������̴�.
										// byteŸ������ ���� ��ȯ�� byte�� ������ 0~255���� �������� Ŭ�� ���Ͱ��̵�.					
		System.out.println((int)(2.9+1.8));//2.8+1.8=4.7���� ������ ��ȯ 
		System.out.println((int)2.9+1.8); //2.9�� ������ ��ȯ 2+1.8
		System.out.println((int)2.9+(int)1.8);//2.9������ ��ȯ + 1.8������ ��ȯ
	}
}
