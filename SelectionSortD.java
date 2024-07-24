package DSA;

public class SelectionSortD {

	public static void main(String[] args) {

		
		 int[] arr = {65, 30, 25, 12, 22, 10, 80};
	        selectionSortDescending(arr);
	        System.out.println("Sorted array in descending order:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	}

	
	 public static void selectionSortDescending(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int maxIdx = i;
	            for (int j = i + 1; j < n; j++)
	                if (arr[j] > arr[maxIdx])
	                    maxIdx = j;

	            int temp = arr[maxIdx];
	            arr[maxIdx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	
	
	
}
