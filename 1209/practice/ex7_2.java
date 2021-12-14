package practice;

import java.util.Vector;

class Point7_2{
	private int x, y;
	public Point7_2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return"("+x+","+y+")";
	}
}


public class ex7_2 {

	public static void main(String[] args) {
		Vector<Point7_2> v = new Vector<Point7_2>();
				
		//3개의 Point 객체 삽입
		v.add(new Point7_2(2,3));
		v.add(new Point7_2(-5,20));
		v.add(new Point7_2(30, -8));
				
		v.remove(1); //인덱스 1의 객체 삭제
				
		//벡터에 있는 Point 객체 모두 검색하여 출력하기
		for(int i=0; i<v.size(); i++) {
			Point7_2 p = v.get(i);
			System.out.println(p);
					
			}
		}
	}



