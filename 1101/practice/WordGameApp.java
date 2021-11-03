package practice;

import java.util.*;

class Player{
    Scanner getWordFromUser = new Scanner(System.in);
    public String name; // ���� ������ �̸� �ʵ�
    public String wordin;
    
    
    public String sayWord() { // ����ڷκ��� �ܾ �Է¹޴� �޼ҵ�
        wordin = getWordFromUser.next(); 
        return wordin;
    }
    
    public boolean checkSuccess(char lastChar) { 
        if (lastChar == wordin.charAt(0)) return true;
        else return false;
    }
}

public class WordGameApp {
	public static void main(String[] agr) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("�����ձ� ������ �����մϴ�...");
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�?");
		int num = s.nextInt();
		String word = "�ƹ���"; //���α׷����� ù �ܾ� �������ֱ�
		
		Player[] play = new Player[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("�������� �̸��� �Է��ϼ���>>");
			play[i] = new Player(); // �� �ڵ� ������ Nullpointexception�� �߻��Ѵٰ� ��
            play[i].name = s.next();
            //�Է¹��� �̸��� Player �迭�� �̸� �ʵ忡 ���� �����ϴ� �ڵ�
        }
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		
		int i = 0, j = 0;
        while(true) {
            j = i % num; //�����ձⰡ �� �ҿ� ������ ���� ���� ����
            int lastIndex = word.length()-1; //������ ���ڿ� ���� �ε���
            char lastChar = word.charAt(lastIndex); //������ ����
            
            System.out.println(play[j].name + " >> ");
            play[j].sayWord(); // ������� �ܾ� �Է� �ޱ�
            boolean continuing = play[j].checkSuccess(lastChar);
            if(continuing == false) {
                System.out.println(play[j].name + "�� �����ϴ�.");
                break;
            }
            word = play[j].wordin;
            i++;
        }
	}
}
