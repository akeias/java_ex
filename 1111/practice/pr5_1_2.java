package practice;

class TV {
	private int size;
	public TV(int size) {this.size=size;}
	protected int getSize() {return size;}
}
class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color= color;

	}
	public void printProperty() {
		System.out.println(getSize()+"��ġ "+color+"�÷�");
	}
}
class IPTV extends TV{
	private String adress;
	private int color;
	public IPTV(String adress, int size, int color) {
		super(size);
		this.adress = adress;
		this.color = color;
	}
	public void printProperty() {
		System.out.println("�ּҴ� "+adress+","+getSize()+"��ġ "+color+"�÷�");
	}
	
}
public class pr5_1_2 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
