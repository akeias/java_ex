package practice;

import java.io.*;

public class pt8_2 {

	public static void main(String[] args) {
		System.out.println("c:\\Temp\\phone.txt�� ����մϴ�.");
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
			System.out.println("���� ��θ� �ٽ� Ȯ�����ּ���.");
		}
	}

}
