package DSA;

public class InsertionSortD {

	public static void main(String[] args) {
		
		
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        insertionSortDescending(arr);
	        System.out.println("Sorted array in descending order:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	}

	
	
	
	public static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
