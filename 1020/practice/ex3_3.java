package practice;

import java.util.Scanner;

public class ex3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ���: ");
		
		int	a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		int max,mid,min;
		
		if(a >b)
			if(a>c)
				if(b>c) {
					max=a;
					mid=b;
					min=c;
				}
				else {//b<c
					max=a;
					mid=c;
					min=b;
				}
			else {//a<c
				max=c;
				mid=a;
				min=b;
			}
		else {//a<b
			if(b>c)
				if(a>c) {
					max=b;
					mid=a;
					min=c;
				}
				else {//a<c
					max=b;
					mid=c;
					min=a;
				}
			else {//b<c
				max=c;
				mid=b;
				min=a;	
			}
		}		
		System.out.println("max�� "+max+", min�� "+min+", mid��"+mid+"�Դϴ�.");
		
		scanner.close();						
	}
}

