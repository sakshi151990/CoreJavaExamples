package Sorting;

public class insertionsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr1 = {10,34,2,56,7,67,88,42};

int ele=0;
		 for (int i = 1; i < arr1.length; i++) {
			 
			 for (int j = i; j > 0; j--) {
				
				 if(arr1[j] < arr1[j-1])
				 {
					 ele=arr1[j];
					 arr1[j]=arr1[j-1];
					 arr1[j-1]=ele;
				 }
				 
			/*	 for(int i = 1; i < A.length; i++){
			            int value = A[i];
			            int j = i - 1;
			            while(j >= 0 && A[j] > value){
			                A[j + 1] = A[j];
			                j = j - 1;
			            }
			            A[j + 1] = value;
			        }

*/

			   
			}
			
		}
		 
		 
	        for(int i:arr1){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    

	}

}
