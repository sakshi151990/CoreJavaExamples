import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;;






public class iteratorandlistiterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Integer> listnumber=new ArrayList<Integer>();
		listnumber.add(1);
		listnumber.add(1);
		listnumber.add(2);
		listnumber.add(16);
		
		ListIterator<Integer> listitr=listnumber.listIterator();
		System.out.println("Used listiterator :");
		System.out.println("Forward direction: ");
		while (listitr.hasNext())
		{	//getting index in list iterator
			System.out.println( "Index: " +  listitr.nextIndex() + " value " + listitr.next());
		listitr.add(5);
			
		}
		System.out.println("Backward direction: ");
			while(listitr.hasPrevious())
			{
				System.out.println("Index "+listitr.previousIndex()+" value "+listitr.previous() );
			}
		
	System.out.println("Used iterator :");
	
	Iterator<Integer> itr = listnumber.iterator();
	
	while(itr.hasNext())
	{
		Integer number=itr.next();
		System.out.println(number);
		
	
	}
	}
	}


