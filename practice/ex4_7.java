package practice;

import java.util.Scanner;

public class ex4_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int intArray[] = new int[5]; //배열 생성
		int max=0; //현재 가장 큰 수 
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			intArray[i] = s.nextInt(); //입력받은 정수를 배열에 저장
			if(intArray[i] > max) // intArray[i]가 현재 가장 큰 수 보다 크면
				max=intArray[i];// intArray[i]를 max로 변경
		}
		System.out.print("가장 큰 수는 "+max+"입니다.");
		s.close();

	}

}
