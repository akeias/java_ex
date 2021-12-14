package practice;

class Person13{
	private int weight;   //private 접근지정. Student 클래스에서 접근불가
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student13 extends Person13{
	public void set() {
		age=30;
		name="홍길동";
		height=175;
		//weight=99;  슈퍼 클래스의 private 멤버로 인해 접근 불가 
		setWeight(99); //private 멤버 weight은 setWeight()으로 간접 접근
	}
}

public class ex5_2 {
	public static void main(String[] args) {
		Student13 s= new Student13();
		s.set();
	}
}
