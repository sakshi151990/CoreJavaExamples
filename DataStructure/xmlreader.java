import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class xmlreader {

	/**
	 * @param args
	 */


		
	
		    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
		    	 // throw new UnsupportedOperationException("Waiting to be implemented.");
		    	
		    	List<String> list=new ArrayList<String>();
		    	
		    	Matcher m1=Pattern.compile("(<folder name=\")").matcher(xml);
		    	Matcher m2=Pattern.compile("\">|\"\\s+/>").matcher(xml);
		    	
		    	while(m1.find() && m2.find())
		    			    	{
		    	if(xml.substring(m1.end(),m2.start()).charAt(0)== startingLetter)
		    		list.add(xml.substring(m1.end(),m2.start()));
		    	}
				return list;
		        
		        
		        
		    }
		    
		    public void printArray(T[] a){}
		        
		    public static void main(String[] args) throws Exception {
		        String xml =
		                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
		                "<folder name=\"c\">" +
		                    "<folder name=\"program files\">" +
		                        "<folder name=\"uninstall information\" />" +
		                    "</folder>" +
		                    "<folder name=\"users\" />" +
		                "</folder>";

		        Collection<String> names = folderNames(xml, 'p');
		        for(String name: names)
		            System.out.println(name);
		    }
		
		
	}


