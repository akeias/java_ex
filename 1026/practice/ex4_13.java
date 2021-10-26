package practice;

public class ex4_13 {

	public static void main(String[] args) {
		double sum= 0.0;
		
		for (int i=0; i<args.length; i++) // 인자 갯수만큼 반복
			sum+=Double.parseDouble(args[i]);// 문자열을 실수(double타입)으로 변환하여 합산 
		
		System.out.println("sum = "+sum);
	}

}
