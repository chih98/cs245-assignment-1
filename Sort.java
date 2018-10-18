/** 

	QuickSort
	-implemenets SortingAlgorithm 
	- Performs quick sort
	
	@author Marko Crnkovic
*/
public class Sort {

	public static void main(String[] args) {

		int l = 0;
		int r = a.length - 1;
		sort(a, l, r, 3);

	}

	/**
		helper function that performs quicksort
		@param a - array to sort
		@param left - left int
		@param right - right int 
	*/
	private int[][] sort(int[] a, int left, int right, int run_size) {

		// It's bad practice to directly mutate parameters 
		int[] arr = a;
		int[][] runs;

		int s = split(arr, left, right); 

		if (left > right) {

			sort(arr, left, s - 1);
			
		} else {

			sort(arr, s + 1, right);
		
		}

		// iterating through array looking for runs, then merging them.
		for (int i = 2; i < arr.length; i++) {

			int numRuns = 0;


			int prev1 = arr[i-2];
			int prev2 = arr[i-1];

			boolean found = false;
			int iterator = 0;
			if (arr[i] > prev2 && prev2 > prev1) {
				runs[numRuns][iterator] = prev1;
				runs[numRuns][iterator+1] = prev2;
				runs[numRuns][iterator+2] = arr[i];
				found = true;
			}

			if (found) {
				iterator = 0;
				found = false;
				numRuns++;
			}

		}

		return runs;
	}

	/**
		splits the array
		@param arr - the array
		@param left - left side of split
		@param right - right side of split
	*/
    int split(int[] arr, int left, int right){
        int p = arr[right];

        int i = left - 1;
       
        for (int j = left; j <= right; j++){
           
            if (arr[j] <= p) {
                
                i++;

                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;

            }
        }
        return p;
    }

}