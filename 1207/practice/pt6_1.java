package practice;

public class pt6_1 {
	private int x, y;
	public pt6_1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
	public boolean equals(Object obj) {
		pt6_1 p = (pt6_1)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		pt6_1 p = new pt6_1(3,50);
		pt6_1 q = new pt6_1(4,50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점 ");
		else
			System.out.println("다른 점");
	}

}
