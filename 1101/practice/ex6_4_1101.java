package practice;

public class ex6_4_1101 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);  //     �̸�:ȫ�浿
		System.out.println("����:"+s.getTotal());// ����:236
		System.out.println("�̸�:"+s.getAverage());//���:78.7 �� ��µǾ���
		
	}
}
	
	class Student{ // 6-3���� Ŭ���� ����
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
		String getAverage() { //���� �Ѱ� ������Ÿ���� float���γ��Ӿ������00000
			String arv = String.format("%.1f", (kor+eng+math)/(float)3);
			return arv;
		/*
		 float getAverage(){ //�������� �Ѱ�
		 	return (int)(getTotal()/3f*10+0.5f)/10f;
		 */
	}

}


