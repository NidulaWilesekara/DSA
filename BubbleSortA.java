package DSA;

public class BubbleSortA {

	public static void main(String[] args) {
		int []arr = {5,1,3,2,4};
		bubblesortAscending(arr);
        System.out.println("Sorted array in descending order:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	

	}
static void bubblesortAscending(int[]arr) {
	
	int n = arr.length;
	int temp = 0;
	boolean swap = true;
	
	while(swap) {
		swap=false;
		for(int x=1; x<(n); x++) {
			if(arr[x-1]>arr[x]) {
				temp = arr[x-1];
				arr[x-1]=arr[x];
				arr[x]=temp;
				swap=true;
			}
		}
	}
}
}
