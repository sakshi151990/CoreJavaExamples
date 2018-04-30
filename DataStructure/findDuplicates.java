import java.util.HashMap;
import java.util.Map;


public class findDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find duplicates in array:
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		int[] array={1,1,2,4,5,6,6,8,8,8};
		for(int i =0;i<array.length;i++)
		{
			
			if(map.containsKey(array[i]))
			{
				map.put(array[i], map.get(array[i])+1);
			}
			else
				map.put(array[i], 1);
		}
		
		
		
		System.out.println(map);

	}

}
