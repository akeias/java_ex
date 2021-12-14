package practice;

class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];//SutdaCard �ν��Ͻ� ������ ���� ���� ����
	
	SutdaDeck(){
		for(int i=0; i< cards.length; i++) {// i�� ����0~19������ cards�� ���� 20�̱⶧��
			int num=i%10+1; // �̽��� ����ϸ� 1~10�� �ݺ��Ҽ�����
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);// AND�� OR���� �켱�����̱⋚���� ��ȣ �ʼ���
			cards[i]=new SutdaCard1(num,isKwang);
		}
	}
	void shuffle() {
		int idx = 0;
		SutdaCard1 tmp;
		for (int i = 0; i <CARD_NUM; i++) {
			idx = (int)(Math.random()*CARD_NUM);
			tmp = cards[i];
			cards[i] = cards[idx];
			cards[idx] = tmp;
		}
	}
	public SutdaCard1 pick(int index) {
		return cards[index];
	}
	SutdaCard1 pick() {
		int idx = (int)(Math.random()*CARD_NUM);
		return cards[idx];
	}					
}
class SutdaCard1{
	int num;
	boolean isKwang;
	
	SutdaCard1(){
		this(1, true);
	}
	SutdaCard1(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	//info()��� Object Ŭ������ toString()�� �������̵��ߴ�.
	public String toString() {
		return num + (isKwang ? "k":"");
	}
}
public class pdf7_1_2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}


