package practice;

import java.util.Scanner; // import를 사용해 스캐너기능이 있는 java.util패키지로 경로를 나타냄

public class ex2_4 {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		        //이 부분의 scanner는 변수임.
		
		String name = scanner.next(); //문자열 읽기(string)
		System.out.print("이름은 "+name+",");
		
		String city = scanner.next(); //문자열 일기(string)
		System.out.print("도시는 "+city+",");
		
		int age = scanner.nextInt(); //정수 읽기(int)
		System.out.print("나이는 "+age+"살,");
		
		double weight = scanner.nextDouble(); //실수 읽기(double)
		System.out.print("체중은 "+weight+"kg,");
		
		boolean isSingle = scanner.nextBoolean(); //논리값 읽기(boolean)
		System.out.println("독신 여부는 "+ isSingle+"입니다.");
		scanner.close(); //scanner 끝내기
	}

}
