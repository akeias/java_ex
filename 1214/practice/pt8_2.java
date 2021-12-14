package practice;

import java.io.*;

public class pt8_2 {

	public static void main(String[] args) {
		System.out.println("c:\\Temp\\phone.txt를 출력합니다.");
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\Temp\\phone.txt");
			int c;
			while((c= fr.read()) != -1) {
					System.out.print((char)c);
			}
			fr.close();
		}
		catch(IOException e) {
			System.out.println("파일 경로를 다시 확인해주세요.");
		}
	}

}
