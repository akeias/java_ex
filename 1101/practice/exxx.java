package practice;

public class exxx {
	int radius;
	public exxx(int radius) {this.radius = radius; }
	public void set(int radius) {this.radius = radius; }
	public static void main(String [] args) {
		exxx ob1 = new exxx(1);
		exxx ob2 = new exxx(2);
		exxx s;
		
		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.radius="+ob1.radius);
		System.out.println("ob2.radius="+ob2.radius);
	}
}
