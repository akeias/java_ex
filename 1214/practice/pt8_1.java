package practice;

import java.io.*;
import java.util.*;

public class pt8_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		FileWriter fi  = null;
		try {
			fi = new FileWriter("c:\\Temp\\phone.txt");
			
			while(true) {
				System.out.println("�̸� ��ȭ��ȣ >> ");
				String phoneNumber = sc.nextLine();
				if(phoneNumber.equals("�׸�"))
					break;
				fi.write(phoneNumber, 0, phoneNumber.length());
				fi.write("\r\n", 0, 2);
			}
			fi.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
		System.out.println("c:\\Temp\\phone.txt�� �����Ͽ����ϴ�.");
		sc.close();
	}
}
