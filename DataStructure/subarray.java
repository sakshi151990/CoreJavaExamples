import java.util.ArrayList;
import java.util.List;




public class subarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<int[]> list=new ArrayList<int[]>();
		
		int count=0;
		int[]  array={1 ,-2, 4, -5, 1};
		
		for (int i = 0; i < array.length; i++) {
		
			
			for (int j = i; j < array.length; j++) {
				int sum=0;
				
				for(int k=i; k<=j;   k++)
				{
					sum=sum+array[k];
					
				}
					
					if(sum < 0)
						count++;
					
			}
			
				
		}
		
		String s="str";
		for (int i = 0; i < 5; i++) {
			s=s+i;
			System.out.println(s);
			
		}

			
	System.out.println(count);
    }
	
	}
	

