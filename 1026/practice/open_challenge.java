package practice;

import java.util.*;

public class open_challenge {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			int randomNum = r.nextInt(100);//0-99사이 랜덤 결정
			int min=0, max=99;
			System.out.println("수를 결정 하였습니다. 맞추어 보세요");
			
			for(int i=1;; i++) {	
				System.out.printf("%d-%d\n",min,max);
				System.out.println(i+">>");				
				int usernum = s.nextInt(); //입력값을 username에 저장
					
				if (usernum>randomNum) {
					System.out.println("더 낮게");	
					max=usernum;
				}
				else if(usernum<randomNum) {
					System.out.println("더 높게");
					min=usernum;
				}
				else if(usernum==randomNum) {
					System.out.println("맞았습니다.");	
					System.out.print("다시 하시겠습니까?(Y,N)>>");
					char select = s.next().charAt(0);
					if (select =='y')
						break;
					else if (select == 'n')
						return;
					else
						System.out.println("잘못입력하셨습니다.");
				}					
			}	
			s.close();
		}
	}
}

