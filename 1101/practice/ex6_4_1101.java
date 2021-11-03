package practice;

public class ex6_4_1101 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);  //     이름:홍길동
		System.out.println("총점:"+s.getTotal());// 총점:236
		System.out.println("이름:"+s.getAverage());//평균:78.7 이 출력되야함
		
	}
}
	
	class Student{ // 6-3문제 클래스 정의
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
			
		int getTotal() {
			int sum = kor+eng+math; 
			return sum;
			}
		String getAverage() { //내가 한거 데이터타입이 float으로나왓어야햇음00000
			String arv = String.format("%.1f", (kor+eng+math)/(float)3);
			return arv;
		/*
		 float getAverage(){ //교수님이 한거
		 	return (int)(getTotal()/3f*10+0.5f)/10f;
		 */
	}

}


