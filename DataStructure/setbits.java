import java.util.BitSet;
import java.util.Scanner;

public class setbits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		BitSet B1 = new BitSet(N);

		B1.set(0, N - 1, false);
		

		BitSet B2 = new BitSet(N);
		B2.set(0, N - 1, false);
		int M = in.nextInt();
		for (int i = 0; i < M; i++) {

			String op = in.next();
			int x = in.nextInt();

			int y = in.nextInt();

			if (op.equals("AND")) {

				if (x == 1)

					B1.and(B2);
				else
					B2.and(B1);

			}

			else if (op.equals("SET")) {
				if (x == 1)
				B1.set(y, true);
				else
				B2.set(y, true);

			} else if (op.equals("FLIP")) {
				if (x == 1)
				B1.flip(y);
				else
				B2.flip(y);

			} else if (op.equals("OR")) {

				if (x == 1)

					B1.or(B2);
				else
					B2.or(B1);

			} else if (op.equals("XOR")) {

				if (x == 1)

					B1.xor(B2);
				else
					B2.xor(B1);

			}

		
			System.out.println(B1.cardinality()+" "+B2.cardinality());
		
		}

	
	}

}
