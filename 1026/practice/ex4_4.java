package practice;

public class ex4_4 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) { //1�ܿ��� 9��
			for(int j=1; j<10; j++) { // �� ���� ������ ���
				System.out.print(j+"*"+i+"="+i*j); //������ ���
				System.out.print('\t'); //�ϳ��� ������	����
			}
			System.out.println(); //�� ���� ������ ���� �ٷ� Ŀ�� �̵�
		}

	}

}