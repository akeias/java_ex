package practice;

public class ex2_9 {

	public static void main(String[] args) {
		short a=(short)0x55ff;
		short b=(short)0x00ff;
		//��Ʈ �� ����
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a&b)); //��Ʈ AND
		System.out.printf("%04x\n", (short)(a|b)); //��Ʈ OR
		System.out.printf("%04x\n", (short)(a^b)); //��Ʈ XOR
		System.out.printf("%04x\n", (short)(~a)); //��Ʈ NOT
		
		byte c=20; //byte=1bit �� 20�� 00010100 ���� ��Ÿ����. 
		byte d=-8; //-8�� 10001000���� ��Ÿ������. *���������� -�� �ֻ�����Ʈ�� 1�� �����Ѵ�. �ݴ�� ����� 0.
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2); //c�� 2��Ʈ �������� ����Ʈ, 01010000������ 10������ ��ȯ�ϸ� 80�̵�.
		System.out.println(c>>2); //c�� 2��Ʈ ���������� ����Ʈ, 00000101������ 10������ ��ȯ�ϸ� 5����.
		System.out.println(d>>2); //d�� 2��Ʈ ���������� ����Ʈ , 10000010������ 2����.
		System.out.printf("%x=n", (d>>>2));
		
		//%04�ΰ� %x�ΰ� %���ñ���� �𸣰���. ����̾ȳ�. 0x55ff�� ���ȳ�.
	}

}