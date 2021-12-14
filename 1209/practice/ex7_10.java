package practice;

public class ex7_10 {
	public static <T> GStack<T> reverse(GStack<T> a){//T�� Ÿ�� �Ű������� ���׸� �޼ҵ�
		
		GStack<T> s = new GStack<T>(); // ���� a�� �ݴ�� ������ ���� GStack ����
		while(true) {
			T tmp; 
			tmp = a.pop(); //���� ���ÿ��� ��� �ϳ��� ����
			if(tmp == null)//������ �����
				break; 
			else
				s.push(tmp); //�� ���ÿ� ��� ����
		}
		return s; //�� ������ ����
	}
	
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for(int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs = reverse(gs);
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}

}
