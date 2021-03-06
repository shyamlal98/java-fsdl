package coding_qn_practices;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2,9,1,3,5,8,0};
//		int arr[] = {9,8,7,6,5,4,2,1};
//		int arr[] = {4, 1, 3, 9, 7};
		int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};
//		int arr[] = {64,25,12,22,11};
		insertionSort(arr);

	}
	
	public static void insertionSort(int [] arr) {
		int n = arr.length;
		int x;
		for(int i = 1; i < n; i++ ) {
			int j = i;
			while(j >= 0) {
				x = arr[j];
				if(j > 0 && arr[j-1] > arr[j])
					swap(arr,j,j-1);
				if(arr[j] == x)
					break;
				j--;
			}
			printArray(arr);
		}
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void swap(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
