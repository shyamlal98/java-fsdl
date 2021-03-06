public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[] = {7, 10, 4, 3, 20, 15};
    System.out.print(kthSmallest(arr, 0, arr.length-1,3));
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void swap(int []arr,int a, int b) {
		int temp;
		temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static int partition(int []arr,int l, int r) {
		int x = arr[r];
		int i = l;
		for(int j = l; j <= r-1;j++) {
			if(arr[j] <= x) {
				swap(arr,i,j);
				i++;
			}
		}
		swap(arr,i,r);
		return i;
	}
	
	   // IN ARR[] ARE DISTINCT
    public static int kthSmallest(int arr[], int l, int r, int k)
    {
        // If k is smaller than number of elements in array
        if (k > 0 && k <= r - l + 1)
        {
            // Partition the array around a random element and
            // get position of pivot element in sorted array
            int pos = partition(arr, l, r);
 
            // If position is same as k
            if (pos-l == k-1)
                return arr[pos];
 
            // If position is more, recur for left subarray
            if (pos-l > k-1)
                return kthSmallest(arr, l, pos-1, k);
 
            // Else recur for right subarray
            return kthSmallest(arr, pos+1, r, k-pos+l-1);
        }
 
        // If k is more than number of elements in array
        return Integer.MAX_VALUE;
    }

}
