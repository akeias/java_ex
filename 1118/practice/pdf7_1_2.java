package practice;

class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];//SutdaCard 인스턴스 저장을 위한 공간 생성
	
	SutdaDeck(){
		for(int i=0; i< cards.length; i++) {// i의 값이0~19가지다 cards의 값이 20이기때문
			int num=i%10+1; // 이식을 사용하면 1~10을 반복할수있음
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);// AND가 OR보다 우선순위이기떄문에 괄호 필수임
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
	//info()대신 Object 클래스의 toString()을 오버라이딩했다.
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


