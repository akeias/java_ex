package practice;

public class Kwang {	
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());   //3이 출력되야함
		System.out.println(card2.info());	//1K가 출력되야함
		
	}
}

class SutdaCard{ //객체지향 6-1문제 SutdaCard 클래스 정의
	int num;
	boolean isKwang;
	
	public SutdaCard() { //객체지향 6-2 문제 SutdaCard클래스의 두 생성자중 1
		num=1;
		isKwang=true;   //this(1,true); 랑 똑같음
	}
	
	public SutdaCard(int num, boolean isKwang) { // 두생성자중 2
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() { //info()함수 만듬
		if(isKwang) { // isKwang == true 랑 같음 
			return num+"K";
		}
		else   // 안써도 됨
			return num+""; // num이 String형이 아니라서 ""을 붙여줌
		
		/*
		 return num+(isKwang ? "K" : "");
		 	으로 줄일 수 있음 근데 뭔소린지 모르겟삼. ?가 참이면? k :가 아니면 "" 인가봄
		 */
	}
}
