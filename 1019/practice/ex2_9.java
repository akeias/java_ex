package practice;

public class ex2_9 {

	public static void main(String[] args) {
		short a=(short)0x55ff;
		short b=(short)0x00ff;
		//비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a&b)); //비트 AND
		System.out.printf("%04x\n", (short)(a|b)); //비트 OR
		System.out.printf("%04x\n", (short)(a^b)); //비트 XOR
		System.out.printf("%04x\n", (short)(~a)); //비트 NOT
		
		byte c=20; //byte=1bit 즉 20은 00010100 으로 나타낸다. 
		byte d=-8; //-8은 10001000으로 나타내진다. *이진법에서 -는 최상위비트에 1을 삽입한다. 반대로 양수는 0.
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2); //c를 2비트 왼쪽으로 시프트, 01010000임으로 10진수로 변환하면 80이됨.
		System.out.println(c>>2); //c를 2비트 오른쪽으로 시프트, 00000101임으로 10진수로 변환하면 5가됨.
		System.out.println(d>>2); //d를 2비트 오른쪽으로 시프트 , 10000010임으로 2가됨.
		System.out.printf("%x=n", (d>>>2));
		
		//%04인가 %x인가 %뭐시기들은 모르겟음. 기억이안남. 0x55ff도 기억안남.
	}

}