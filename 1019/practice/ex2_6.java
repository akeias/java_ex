package practice;

public class ex2_6 {

	public static void main(String[] args) {
		int a=3, b=3, c=3; //대입 연산자 예시
		a +=3; //a=a+3
		b *=3; //a=a*3
		c %=2; //a=a%2
		System.out.println("a="+a+", b="+b+", c="+c);
		
		int d=3; //증감 연산자 예시
		a = d++;
		System.out.println("a="+a+", d="+d);
		a = ++d;
		System.out.println("a="+a+", d="+d);
		a = d--;
		System.out.println("a="+a+", d="+d);
		a = --d;
		System.out.println("a="+a+", d="+d);
		
	}

}
