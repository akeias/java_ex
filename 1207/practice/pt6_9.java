package practice;

import java.util.*;

public class pt6_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("ö��[����(1), ����(2), ��(3), ������(4)]");
			int Player = s.nextInt();
			if(Player==4) {
				System.out.println("�����մϴ�...");
				break;
			}
			String arr[] = {"����", "����", "��"};
			int Com = (int)(Math.random()*3+1);
			System.out.println("ö��("+arr[Player-1]+") : ��ǻ��("+arr[Com-1]+")");
			switch(Player){
				case 1:
					if(Com==1) {
						System.out.println("�����ϴ�.");
					}
					else if(Com==2) {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					}
					else {
						System.out.println("ö���� �̰���ϴ�.");
					}
					break;
				case 2:
					if(Com==1) {
						System.out.println("ö���� �̰���ϴ�.");
					}
					else if(Com==2) {
						System.out.println("�����ϴ�.");
					}
					else {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					}
					break;
				case 3:
					if(Com==1) {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					}
					else if(Com==2) {
						System.out.println("ö���� �̰���ϴ�.");
					}
					else {
						System.out.println("�����ϴ�.");
					}
					break; 		
			}
		}s.close();
	}
}
