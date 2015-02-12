package BS_Package;
/**
 * 
 */

/**
 * @author INTEL
 *
 */
public class bubblesort {
	public static void main(String[]args){
		int[]numbers={2131321321,111};
		bsort(numbers);
		printArray(numbers);
	}
	


	public static void bsort (int A []){
	  for(int i = 0; i<A.length-1;i++){
		 for(int j=0;j<A.length-1-i;j++){
		    			 if(A[j] > A[j+1]){
							int temp = A[j+1];
							A[j+1]=A[j];
							A[j]=temp;
							
			 }				
	      } 
      
	  }
	  return;   
}
	
	public static void printArray (int[]A){
	for(int i=0; i<A.length;i++){
		System.out.println(A[i]);
	   }
	}
}

