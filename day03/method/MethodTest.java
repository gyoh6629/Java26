package method;

import java.util.Arrays;

public class MethodTest {

	public static void main(String[] args) {
		int[] numArr = {3, 6, 2, 4, 8};
		
		System.out.println("getSum의 결과값 = " + getSum(numArr));
		System.out.println("getMax의 결과값 = " + getMax(numArr));
		System.out.println("getCount의 결과값 = " + getCount(numArr, 3));
		swapArray(numArr);
		System.out.print("swapArray의 결과값 = " + Arrays.toString(numArr));
	}
	
	public static int getSum(int[] numArr) {
		
		if(numArr == null) return -1;
		int sum = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		return sum;
	}
	
	public static int getMax(int[] numArr) {
		int max = numArr[0];
		
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] > max) max = numArr[i];
		}
		
		return max;
	}
	
	public static int getCount(int[] numArr, int target) {
		int count = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] == target) count++;
		}
		
		return count;
	}
	
	public static void swapArray(int[] numArr) {
		int temp;
		int al = numArr.length;
		for(int i = 0; i < al / 2; i++) {
			temp = numArr[i];
			numArr[i] = numArr[al - i - 1];
			numArr[al - i - 1] = temp;
		}
	}
}
