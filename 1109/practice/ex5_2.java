package practice;

class Person13{
	private int weight;   //private ��������. Student Ŭ�������� ���ٺҰ�
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
		name="ȫ�浿";
		height=175;
		//weight=99;  ���� Ŭ������ private ����� ���� ���� �Ұ� 
		setWeight(99); //private ��� weight�� setWeight()���� ���� ����
	}
}

public class ex5_2 {
	public static void main(String[] args) {
		Student13 s= new Student13();
		s.set();
	}
}
