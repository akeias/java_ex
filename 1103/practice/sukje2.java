package practice;

public class sukje2 {
	public static void main(String[] agrs) {
		int[][]arr= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total=0;
		float average=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; i++) {
				total+=arr[i][j];
			}
		}
		
		
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}
