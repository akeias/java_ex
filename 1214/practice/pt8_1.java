package practice;

import java.io.*;
import java.util.*;

public class pt8_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		FileWriter fi  = null;
		try {
			fi = new FileWriter("c:\\Temp\\phone.txt");
			
			while(true) {
				System.out.println("이름 전화번호 >> ");
				String phoneNumber = sc.nextLine();
				if(phoneNumber.equals("그만"))
					break;
				fi.write(phoneNumber, 0, phoneNumber.length());
				fi.write("\r\n", 0, 2);
			}
			fi.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		System.out.println("c:\\Temp\\phone.txt에 저장하였습니다.");
		sc.close();
	}
}
