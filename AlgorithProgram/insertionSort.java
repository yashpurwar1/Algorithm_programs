package AlgorithProgram;

//Java program for implementation of Insertion Sort
public class insertionSort {

	// Function to sort array using insertion sort 
	static void sort(int nums[]) {
		int n = nums.length;
		for (int j = 1; j < n; j++) {
			int key = nums[j];
			int i = j - 1;

			while ((i > -1) && (nums[i] > key)) {
				nums[i + 1] = nums[i];
				i--;
			}
			nums[i + 1] = key;
		}
	}

	// Driver method
	public static void main(String a[]) {
		int[] nums = { 9, 14, 3, 2, 43, 11, 58, 22 };
		/* print array of size n */
		System.out.println("Before Insertion Sort");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();

		sort(nums);// sorting array using insertion sort
		// print array of size n
		System.out.println("After Insertion Sort");
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}