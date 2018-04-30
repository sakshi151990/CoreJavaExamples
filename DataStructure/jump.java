import java.util.Scanner;


public class jump {

	/**
	 * @param args
	 * 
	 */
	public static boolean canWin(int leap, int[] game) {
		 int jumpi=0;
		if(canleap(leap, jumpi,game))
			return true;
		else
		
	return false;
		
		
	 }
	 public static boolean canleap(int leap,int jumpi,int[] game)
	 {   	 if(jumpi < 0 || game[jumpi]==1) return false;
		 if((jumpi+leap >  game.length-1) || jumpi == game.length-1)
			 return true;
		
		 game[jumpi]=1;
			 return canleap(leap,jumpi+leap,game)||
		  canleap(leap,jumpi+1,game) ||  canleap(leap,jumpi-1,game);
	 }
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		        Scanner scan = new Scanner(System.in);
		        int q = scan.nextInt();
		        while (q-- > 0) {
		            int n = scan.nextInt();
		            int leap = scan.nextInt();
		            
		            int[] game = new int[n];
		            for (int i = 0; i < n; i++) {
		                game[i] = scan.nextInt();
		            }

		            System.out.println( (canWin(leap,game)) ? "YES" : "NO" );
		        }
		        scan.close();
		        long A=5; long B=10; long a=1;
		     System.out.println(A/B);
		   //     long num=(long)a/each;
	

		
		
	}

