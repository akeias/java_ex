package practice;

class Point6{
	private int x, y;
	public Point6(int x, int y) {this.x=x; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}
}

class ColorPoint6 extends Point6{
	private String color;
	public ColorPoint6() {
		super(0,0);
		color= "BLACK";
	}
	public ColorPoint6(int x, int y) {
		super(x,y);
		color = "BLACK";
	}
	public ColorPoint6(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
		
	public void setColor(String color) {
		this.color= color;
	}
	public String toString() {
		String ts = color+"색의 "+"("+getX()+","+getY()+")의 점";
		return ts;
	}
}



public class pr5_6 {
	public static void main(String[] args) {
		ColorPoint6 zeroPoint = new ColorPoint6();
		System.out.println(zeroPoint.toString()+"입니다.");

		ColorPoint6 cp = new ColorPoint6(10,10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}

}
