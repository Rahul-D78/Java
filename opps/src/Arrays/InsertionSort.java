package Arrays;

public class InsertionSort {

	
	static void sort(int []arr) {
		int len = arr.length;     //5
		for(int i = 0; i < len; i++) { // 0 to 3
            int key = arr[i];
            int j = i-1;
            
           while(j >= 0 && arr[j] > key) {
            	arr[j+1] = arr[j];
            	j = j-1;
            }
			arr[j+1] = key; 
				}
			}

	public static void main(String[] args) {
		
		int [] arr = {5,19,2,3,4,5}; 
		InsertionSort.sort(arr);
        for(int ele : arr) {
        	System.out.print(ele + " ");
        }
	}
}



	


