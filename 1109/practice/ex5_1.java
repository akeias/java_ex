package practice;

class Point11{
	private int x, y;
	public void set(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint11 extends Point11{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class ex5_1 {
	public static void main(String[] args) {
		Point11 p = new Point11();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint11 cp = new ColorPoint11();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}

