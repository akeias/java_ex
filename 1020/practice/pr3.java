package practice;

import java.util.Scanner;

public class pr3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("금액을 입력하시오: ");
		int money= s.nextInt();

		int oman = money / 50000;//102800 oman <- 2
        int remainder = money % 50000;
        if(oman !=0)
        	System.out.println("오만원권 "+ oman+"매");
        else
        	System.out.println("오만원권 0매");
 
        int man = remainder / 10000;
        remainder = remainder % 10000;
        if(man !=0) 
        	System.out.println("만원권 "+ man+"매");
        
        int chun = remainder / 1000;
        remainder = remainder % 1000;
        if(man !=0) 
        	System.out.println("천원권 "+ chun+"매");
 
        int obaek = remainder / 500;
        remainder = remainder % 500;
        if(man !=0) 
        	System.out.println("오백원 "+ obaek+"개");
 
        int baek = remainder / 100;
        remainder = remainder % 100;
        if(man !=0) 
        	System.out.println("백원 "+ baek+"개");
        
        int osib = remainder / 50;
        remainder = remainder % 50;
        if(man !=0) 
        	System.out.println("오십원 "+ osib+"개");
        
        int sib = remainder / 10;
        remainder = remainder % 10;
        if(man !=0) 
        	System.out.println("십원 "+ sib+"개");
        
        int il = remainder / 1;
        remainder = remainder % 1;
        if(man !=0) 
        	System.out.println("일원 "+ il+"개");
		
		s.close();

	}

}
