package practice;

import java.util.*;

public class open_challenge {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			int randomNum = r.nextInt(100);//0-99���� ���� ����
			int min=0, max=99;
			System.out.println("���� ���� �Ͽ����ϴ�. ���߾� ������");
			
			for(int i=1;; i++) {	
				System.out.printf("%d-%d\n",min,max);
				System.out.println(i+">>");				
				int usernum = s.nextInt(); //�Է°��� username�� ����
					
				if (usernum>randomNum) {
					System.out.println("�� ����");	
					max=usernum;
				}
				else if(usernum<randomNum) {
					System.out.println("�� ����");
					min=usernum;
				}
				else if(usernum==randomNum) {
					System.out.println("�¾ҽ��ϴ�.");	
					System.out.print("�ٽ� �Ͻðڽ��ϱ�?(Y,N)>>");
					char select = s.next().charAt(0);
					if (select =='y')
						break;
					else if (select == 'n')
						return;
					else
						System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}					
			}	
			s.close();
		}
	}
}

