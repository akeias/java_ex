package practice;

public class pt6_2 {
	private int x, y, z;
	public pt6_2(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "�� a : Circle("+x+","+y+")������"+z ;
	}
	public boolean equals(Object obj) {
		pt6_2 p = (pt6_2)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		pt6_2 a = new pt6_2(2,3,5);
		pt6_2 b = new pt6_2(2,3,30);
		System.out.println("�� a : "+ a);
		System.out.println("�� b : "+ b);
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}
