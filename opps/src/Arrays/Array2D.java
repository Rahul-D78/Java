package Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int a [][] = {
   				  //0   1   2 3  4  5   6
		  			{2, 3, 4, 2, 7, 8 , 9},   //  0
					{1, 34, 23, 67, 45, 12},  //  1
					{21, 45 , 68, 43, 90 ,31} //  2
					};
       System.out.println(a[0][3]);
       System.out.println(a.length);
       
       for(int i = 0; i < a.length; i++) { // 0 to 2
    	   for(int j = 0; j < a[i].length;j++) {
    		   System.out.print(a[i][j] + " ");
    	   }
    	   System.out.println();
       }
       
       int b [][] = new int[3][5];

       for(int i = 0; i < b.length; i++) { // 0 to 2
    	   for(int j = 0; j < b[i].length;j++) {
    		   System.out.print(b[i][j] + " ");
    	   }
    	   System.out.println();
    	   
    	   //giving sizes we need to put data later, hence data initially would be zero...
    	   //giving data first , we need not have to give the size
           //enhance for loop....
	}
	}
	}
