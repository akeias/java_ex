package practice;

import java.util.Scanner;

public class pr7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	System.out.println("점 (x,y)의 좌표를 입력하세요 : ");
	int x= s.nextInt();
	int y= s.nextInt();
	
	if((x>=100&&x<=200)&&(y>=100&&y<=200))
		System.out.print("("+x+","+y+")는 사격형 안에 있습니다.");
	else
		System.out.print("("+x+","+y+")는 사격형 안에 없습니다.");
					
	s.close();
	}
}