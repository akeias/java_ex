package practice;

public class ex4_16 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0]=0;
		try {
			for(int i=0; i<5; i++) {
				intArray[i+1]=i+1+intArray[i]; //i=4�� ��� ���� �߻�
				System.out.println("IntArray["+i+"]"+"="+intArray[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
		}

	}

}
