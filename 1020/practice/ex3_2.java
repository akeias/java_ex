package practice;

import java.util.Scanner;
public class ex3_2 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("�������Է��Ͻÿ�: ");
	 int score = scanner.nextInt();
	 
	 char grade;
	 switch (score/10) {
	 case 10:
	 case 9:
		 grade= 'A' ;
		 break;
	 case 8:
		 grade='B';
		 break;
	 default:
		 grade='F';
	  }
	 System.out.println("������"+grade+"�Դϴ�");
	 scanner.close();
	 }
}
