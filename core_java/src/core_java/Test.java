package core_java;

public class Test {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int arr2[] = new int[arr1.length];
		arr2 = arr1;

		for (int i : arr1) {
			System.out.println(i);
		}

		System.out.println("============== COPY =================");

		for (int i : arr2) {
			System.out.println(i);
		}

		// SUM AND AVERAGE
		int sum = 0;

		for (int i : arr1) {

			sum += i;

		}
		System.out.println("SUM : " + sum);
		
		System.out.println("AVERAGE : " + sum/arr1.length);
		
	}
}
