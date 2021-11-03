package practice;

public class Kwang {	
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());   //3�� ��µǾ���
		System.out.println(card2.info());	//1K�� ��µǾ���
		
	}
}

class SutdaCard{ //��ü���� 6-1���� SutdaCard Ŭ���� ����
	int num;
	boolean isKwang;
	
	public SutdaCard() { //��ü���� 6-2 ���� SutdaCardŬ������ �� �������� 1
		num=1;
		isKwang=true;   //this(1,true); �� �Ȱ���
	}
	
	public SutdaCard(int num, boolean isKwang) { // �λ������� 2
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() { //info()�Լ� ����
		if(isKwang) { // isKwang == true �� ���� 
			return num+"K";
		}
		else   // �Ƚᵵ ��
			return num+""; // num�� String���� �ƴ϶� ""�� �ٿ���
		
		/*
		 return num+(isKwang ? "K" : "");
		 	���� ���� �� ���� �ٵ� ���Ҹ��� �𸣰ٻ�. ?�� ���̸�? k :�� �ƴϸ� "" �ΰ���
		 */
	}
}
