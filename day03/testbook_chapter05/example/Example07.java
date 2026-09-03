package testbook_chapter05;

public class Example07 {

	public static void main(String[] args) {
		int[] a = { 3, 2, 4, 1, 5 };
		int[] b = { 3, 2, 4, 1 };
		int[] c = { 3, 2, 4, 1, 5};
		int[] d = { 2, 7, 1, 8, 2 };
		
		System.out.println(isEqual(a, b));
		System.out.println(isEqual(a, c));
		System.out.println(isEqual(a, d));
	}
	
	static boolean isEqual(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length)
			return false;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}
}
