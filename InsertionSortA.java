package DSA;

public class InsertionSortA {

	public static void main(String[] args) {

		
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        insertionSortAscending(arr);
	        System.out.println("Sorted array in ascending order:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	}
	
	   public static void insertionSortAscending(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

}
