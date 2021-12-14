package practice;

class MyTv2{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	
	private int x;
	
	public void setChannel(int x) {
		this.x=x;
	}
	public int getChannel() {
		return x;
	}
	
	
	
	
}



public class pdf7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
	}
}
