package practice;

import java.util.*;

class GamePlayer{
	Calendar now = Calendar.getInstance();
	Scanner s = new Scanner(System.in);
	private String name, buffer;
	private int sec1, sec2 ;
	
	public GamePlayer(String name) {
		this.name = name;
	}
	public int game() {
		System.out.print(name+" ���� <Enter>Ű  >>");
		sec1 = enter();
		System.out.print("10�� ���� �� <Enter>Ű  >>");
		sec2 = enter();
		if(sec1 < sec2)
			return sec2-sec1;
		else 
			return (60-sec1) + sec2;
	}
	public int enter() {
		setBuffer(s.nextLine());
		now = Calendar.getInstance();		
		System.out.println("\t���� �� �ð� = "+ now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}
	//�̺κ� ����
	public String getBuffer() {
		return buffer;
	}
	public void setBuffer(String buffer) {
		this.buffer = buffer;
	}
	//�� �κб��� ���� ��� �� �����Ϸ��� �̰ž��ٰ� �������� ���� �����ؼ� �������� ��� �ߵ��ư�
}
public class pt6_6 {

	public static void main(String[] args) {
		System.out.println("10�ʿ� ����� �����  �̱�� �����Դϴ�.");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù�� ° �÷��̾���� �Է����ּ���.");
		String player1 = s.nextLine();
		GamePlayer person1 = new GamePlayer(player1);
		
		System.out.println("�ι� ° �÷��̾���� �Է����ּ���.");
		String player2 = s.nextLine();
		GamePlayer person2 = new GamePlayer(player2);
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int result1 = person1.game();
		int result2 = person2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
			System.out.println(player1+"�� ��� "+result1+","+player2+ "�� ��� "+result2+", ���ڴ� "+player1);
		else   
			System.out.println(player1+"�� ��� "+result1+","+player2+ "�� ��� "+result2+", ���ڴ� "+player2);				
		s.close();
	}
}
