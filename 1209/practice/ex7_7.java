package practice;

import java.util.*;

class Student7_7{
	private int id;
	private String tel;
	public Student7_7(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}

public class ex7_7 {

	public static void main(String[] args) {
		HashMap<String, Student7_7> map = new HashMap<String, Student7_7>();
		map.put("황기태", new Student7_7(1, "010-111-1111"));
		map.put("이재문", new Student7_7(2, "010-222-2222"));
		map.put("김남윤", new Student7_7(3, "010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = sc.nextLine();
			if(name.equals("exit")) {
				System.out.println("종료합니다..");
				break;
			}
			Student7_7 student = map.get(name);
			if(student == null)
				System.out.println(name+"은 없는 사람입니다.");
			else
				System.out.println("id : "+student.getId()+",전화 : "+student.getTel());
		}
		sc.close();
	}
}
