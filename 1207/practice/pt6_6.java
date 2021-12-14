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
		System.out.print(name+" 시작 <Enter>키  >>");
		sec1 = enter();
		System.out.print("10초 예상 후 <Enter>키  >>");
		sec2 = enter();
		if(sec1 < sec2)
			return sec2-sec1;
		else 
			return (60-sec1) + sec2;
	}
	public int enter() {
		setBuffer(s.nextLine());
		now = Calendar.getInstance();		
		System.out.println("\t현재 초 시간 = "+ now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}
	//이부분 부터
	public String getBuffer() {
		return buffer;
	}
	public void setBuffer(String buffer) {
		this.buffer = buffer;
	}
	//이 부분까지 굳이 없어도 됨 컴파일러가 이거없다고 오류내서 내가 불편해서 넣은거임 없어도 잘돌아감
}
public class pt6_6 {

	public static void main(String[] args) {
		System.out.println("10초에 가까운 사람이  이기는 게임입니다.");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번 째 플레이어명을 입력해주세요.");
		String player1 = s.nextLine();
		GamePlayer person1 = new GamePlayer(player1);
		
		System.out.println("두번 째 플레이어명을 입력해주세요.");
		String player2 = s.nextLine();
		GamePlayer person2 = new GamePlayer(player2);
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int result1 = person1.game();
		int result2 = person2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
			System.out.println(player1+"의 결과 "+result1+","+player2+ "의 결과 "+result2+", 승자는 "+player1);
		else   
			System.out.println(player1+"의 결과 "+result1+","+player2+ "의 결과 "+result2+", 승자는 "+player2);				
		s.close();
	}
}
