package practice;

import java.io.*;

public class pt8_3 {

	public static void main(String[] args) {
		FileReader fi = null;
		
		try {
			fi = new FileReader("c:\\windows\\system.ini");
			int c;
			while ((c= fi.read())!= -1) {
				c = Character.toUpperCase(c);
				System.out.print((char)c);
			}
			fi.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}	
	}
}
