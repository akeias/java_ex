package practice;

import java.util.*;

public class ex7_5 {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		// var dic = new HashMap<String, String>() 으로 간략화 해도됨
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//사용자로부터 단어를 입력받고 한글 단어검색 "exit" 입력받으면 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는 ?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다..");
				break;
			}
			//해시맵에서 '키' eng의 '값' kor 검색
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng+"는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
		sc.close();
	}

}
