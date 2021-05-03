package Arrays;

public class SortBubble {
	
	static void sort(int []arr) {
		int len = arr.length;     //5
		for(int i = 0; i < len-1; i++) { // 0 to 3
			for(int j = 0; j < len-i-1; j++) { // i = 0 j = 0 to 4
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int [] arr = {5,19,2,3,4,5}; 
		SortBubble.sort(arr);
        for(int ele : arr) {
        	System.out.print(ele + " ");
        }
	}

}
