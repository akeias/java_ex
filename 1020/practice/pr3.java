package practice;

import java.util.Scanner;

public class pr3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��Ͻÿ�: ");
		int money= s.nextInt();

		int oman = money / 50000;//102800 oman <- 2
        int remainder = money % 50000;
        if(oman !=0)
        	System.out.println("�������� "+ oman+"��");
        else
        	System.out.println("�������� 0��");
 
        int man = remainder / 10000;
        remainder = remainder % 10000;
        if(man !=0) 
        	System.out.println("������ "+ man+"��");
        
        int chun = remainder / 1000;
        remainder = remainder % 1000;
        if(man !=0) 
        	System.out.println("õ���� "+ chun+"��");
 
        int obaek = remainder / 500;
        remainder = remainder % 500;
        if(man !=0) 
        	System.out.println("����� "+ obaek+"��");
 
        int baek = remainder / 100;
        remainder = remainder % 100;
        if(man !=0) 
        	System.out.println("��� "+ baek+"��");
        
        int osib = remainder / 50;
        remainder = remainder % 50;
        if(man !=0) 
        	System.out.println("���ʿ� "+ osib+"��");
        
        int sib = remainder / 10;
        remainder = remainder % 10;
        if(man !=0) 
        	System.out.println("�ʿ� "+ sib+"��");
        
        int il = remainder / 1;
        remainder = remainder % 1;
        if(man !=0) 
        	System.out.println("�Ͽ� "+ il+"��");
		
		s.close();

	}

}
