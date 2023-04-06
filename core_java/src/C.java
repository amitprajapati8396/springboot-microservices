import java.util.Arrays;

public class C {
	
	public static int[] swapArrayIndex(int[] elements) {

		int[] temp = new int[elements.length];
		int k;
		int count = 0;
		int length = elements.length;

		for (int i = 0; i < length; i++) {
			k = elements[i];
			temp[i] = elements[i + 1];
			temp[i + 1] = k;
			++i;
			count = i + 1;
			if (count == length)
				break;
		}

		if (count + 1 == elements.length)
			temp[count] = elements[length - 1];

		return temp;
	}

	public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8};
       //int[] arrayIndex = swapArrayIndex(arr);
       System.out.println(Arrays.toString(swapArrayIndex(arr)));
	}
}
