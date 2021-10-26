package practice;

import java.util.Scanner;
public class ex3_2 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("점수를입력하시오: ");
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
	 System.out.println("학점은"+grade+"입니다");
	 scanner.close();
	 }
}
