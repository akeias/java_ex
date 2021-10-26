package practice;

import java.util.Scanner;

public class ex4_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = s.nextLine(); //한 라인 읽기
			if(text.equals("exit")) // "exit"이 입력되면 반복 종료
				break; // while문을 벗어남
		}
		System.out.println("종료합니다...");
		s.close();
	}

}
