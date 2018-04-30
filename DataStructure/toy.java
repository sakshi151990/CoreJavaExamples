import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class toy {

	/**
	 * @param args
	 */

	
	static int surfaceArea(int[][] A,int H,int W) {
		
		int count=0;
		int tb=H*W*2;
	int east=0;
	int west=0;
	int sount=0;
	int north =0;
	
//		if(A.length==1)
//			return A[0][0]*4-2;
		
		
	
		
			
			for (int j = 0; j < W; j++) {
				System.out.print(A[0][j]);
			north=north+A[0][j];
				
			}
			System.out.println();
			for (int j = 0; j < W; j++) {
				System.out.print(A[H-1][j]);
				sount=sount+A[H-1][j];
			
		}
			System.out.println();
			
			for (int j = 0; j < H; j++) {
				System.out.print(A[j][0]);
				west=west+A[j][0];
				
			}  System.out.println();
			for (int j = 0; j < H; j++) {
				System.out.print(A[j][W-1]);
				east=east+A[j][W-1];
			}
			
			System.out.println();
		
		for (int i = 1; i < A.length-1; i++) {
			for (int j = 1; j < A[i].length-1; j++) {
				System.out.print(A[i][j]);
				count=count+A[i][j]*6;
			}
			
		}
		
		return count+east+west+sount+north+tb;
		}        // Complete this function
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A, H, W);
        System.out.println(result);
        in.close();
    }

}
