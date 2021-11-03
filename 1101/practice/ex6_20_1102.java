package practice;

public class ex6_20_1102 {
	
	static int[] shuffle(int[] arr) { // Math.random 떄문에  static 이 붙음
		
		for(int i=0; i<arr.length; i++) {
			int ri = (int)(Math.random()*arr.length);
			int temp= arr[i];
			arr[i]=arr[ri];
			arr[ri]=temp;	
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		 
	}

}
