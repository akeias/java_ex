package practice;

import java.util.*;

public class ex7_6 {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : "+scoreMap.size());
		
		//모든 사람의 점수 출력
		Set<String> keys = scoreMap.keySet(); //모든 Key를 가진 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); //Set에 있는 모든 Key를 순서대로 검색하는 Iterator 리턴
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
	}

}
