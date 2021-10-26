package practice;

import java.util.Scanner;

public class pr1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요(단위 원): ");
		int won= s.nextInt();
		double dollor;
		dollor=won/1100;
		System.out.println(won+"원은 $"+dollor+"입니다.");
		
		s.close();
	}

}
