package testbook_chapter05;

import java.util.Arrays;

public class Example06 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] reverseArr = reverse(arr);
		System.out.println(Arrays.toString(reverseArr));
	}
	
//	public static int[] reverse(int[] org) {
//		int temp;
//		int[] result = new int[org.length];
//		
//		for(int i = 0; i < org.length/2; i++) {
//			temp = org[i];
//			org[i] = org[org.length-1-i];
//			org[org.length-1-i] = temp;
//		}
//		
//		for(int i = 0; i < org.length; i++) {
//			result[i] = org[i];
//		}
//		
//		return result;
//	}
	
	public static int[] reverse(int[] org) {
		int[] result = new int[org.length];
		
		for(int i = 0; i < org.length; i++) {
			result[i] = org[org.length-1-i];
		}
		
		return result;
	}
}
