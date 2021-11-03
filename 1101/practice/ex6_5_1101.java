package practice;

public class ex6_5_1101 {

	public static void main(String[] args) {
		Student1 s = new Student1("홍길동",1,1,100,60,76);
		
		System.out.println(s.info()); // 홍길동,1,1,100,60,76,236,78.7 이 출력되야함

	}

}
class Student1{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
	}
		
	String info() {
		int sum = kor+eng+math;
		float avr = sum/(float)3;
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+String.format("%.1f", avr);	
	}
}
