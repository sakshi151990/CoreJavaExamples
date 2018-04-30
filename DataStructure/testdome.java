
public class testdome {

	/**
	 * @param args
	 */
	
	 public static class TextInput {
		 
		 String val="";
		 
		 public  void add(char c){

	this.val=val.concat(Character.toString(c));
	
	
		 }
		 public  String getValue() {
			return val;}
	 }

	    public static class NumericInput extends TextInput {
	    	@Override
	    	public  void add(char c){
	    		
	    	
	    	if(Character.isDigit(c))
	    		
	    	super.add(c);
	    		
	    		
				 
			 }
	    	
	    	
	    }

	

		// TODO Auto-generated method stub

		   public static void main(String[] args) {
		        TextInput input = new NumericInput();
		        input.add('1');
		        input.add('a');
		        input.add('0');
		        System.out.println(input.getValue());

}}
