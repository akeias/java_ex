package practice;

import java.util.*;

public class pt6_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("철수[가위(1), 바위(2), 보(3), 끝내기(4)]");
			int Player = s.nextInt();
			if(Player==4) {
				System.out.println("종료합니다...");
				break;
			}
			String arr[] = {"가위", "바위", "보"};
			int Com = (int)(Math.random()*3+1);
			System.out.println("철수("+arr[Player-1]+") : 컴퓨터("+arr[Com-1]+")");
			switch(Player){
				case 1:
					if(Com==1) {
						System.out.println("비겼습니다.");
					}
					else if(Com==2) {
						System.out.println("컴퓨터가 이겼습니다.");
					}
					else {
						System.out.println("철수가 이겼습니다.");
					}
					break;
				case 2:
					if(Com==1) {
						System.out.println("철수가 이겼습니다.");
					}
					else if(Com==2) {
						System.out.println("비겼습니다.");
					}
					else {
						System.out.println("컴퓨터가 이겼습니다.");
					}
					break;
				case 3:
					if(Com==1) {
						System.out.println("컴퓨터가 이겼습니다.");
					}
					else if(Com==2) {
						System.out.println("철수가 이겼습니다.");
					}
					else {
						System.out.println("비겼습니다.");
					}
					break; 		
			}
		}s.close();
	}
}
