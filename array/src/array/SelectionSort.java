package array;

public class SelectionSort {

	static void sort(int a[]) {
		
		int n = a.length;
		
		for(int i = 0; i < n-1;i++) {
			
			int minInd = i;
		for(int j = i+1;j < n ;j++) {
			
			if(a[j] < a[minInd]) {
				minInd = j;
			}
		}
				 int temp = a[i];
				 a[i] = a[minInd];
				 a[minInd] = temp;
			}
		}
		

	public static void main(String[] args) {
	
		int [] a = {8,7,6,5,4};
		SelectionSort.sort(a);
		for(int ele : a) {
			System.out.print( ele + " ");
		}
	}
}
