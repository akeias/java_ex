package practice;

import java.util.*;

public class ex7_8 {
	
	static void printList(LinkedList<String> l) { //리스트의 모든 요소를 출력하는 메소드 
		Iterator<String> iterator = l.iterator(); //Iterator 객체 리턴
		while(iterator.hasNext()) { //Iterator 객체에 요소가 있을떄가지 반복
			String e = iterator.next(); // 다음 요소 리턴
			String separator;
			if(iterator.hasNext())
				separator = "=>";
			else
				separator ="\n";
			System.out.print(e+separator);
		}
	}

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		Collections.sort(myList); // 요소 정렬
		printList(myList);  //정렬된 요소 출력
		
		Collections.reverse(myList); // 요소 순서를 반대로 뒤지비
		printList(myList); // 뒤지빈 요소 출력
		
		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+index+"번째 요소입니다.");
		
	}

}
