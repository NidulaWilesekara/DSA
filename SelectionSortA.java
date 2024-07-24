package DSA;

public class SelectionSortA {

	public static void main(String[] args) {

		
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        selectionSortAscending(arr);
	        System.out.println("Sorted array in ascending order:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	}

	
	 public static void selectionSortAscending(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIdx = i;
	            for (int j = i + 1; j < n; j++)
	                if (arr[j] < arr[minIdx])
	                    minIdx = j;

	            int temp = arr[minIdx];
	            arr[minIdx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	
	
}
