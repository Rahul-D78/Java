package Arrays;

public class SortSel {
			
		static void sort(int []arr) {
			int len = arr.length;     //5
			for(int i = 0; i < len-1; i++) { // 0 to 3
				
				//assuming minimum element in i'th place
				int minIndex = i;
				for(int j = i+1; j < len; j++) {
					if(arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
				
				// swap minimum element with first element
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
				}
		}

		public static void main(String[] args) {
			
			    int [] arr = {5,19,2,3,4,5}; 
			    SortSel.sort(arr);
	            for(int ele : arr) {
	            System.out.print(ele + " ");
	        }
		}
	}



