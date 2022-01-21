import java.util.Arrays;

public class Vacle {

	public Vacle() {
	}

	public static double findUniq(double arr[]) {
		int pos = 0;
		for (int r = 0; r < arr.length; r++) {
			int pcont = 0;
			for (double u : arr) {

				if (u == arr[r])
					pcont++;

			}
			if (pcont < 2) {
				pos = r;
				break;
			}
		}

		return arr[pos];
	}

	public static void main(String[] args) {
		for (double j : Vacle.tribonacciBest(new double[] { 17, 16, 20 }, 1)) {
			System.out.println(j);
		}
	}

	public static double[] tribonacci(double[] s,
			int n) { /* Devuelve un arreglo de doubles recortandolo basado en el parametro n */
		double[] u;

		u = new double[n];
		for (int pos = 0; pos < s.length; pos++) {
			if (pos < n) {
				u[pos] = s[pos];
			}
		}

		for (int pos = s.length; pos < n; pos++) {
			if (pos == 2) {
				u[pos++] = u[0] + u[1];
			}

			if (pos == 1) {
				u[pos++] = u[0];
				u[pos++] = u[0] + u[1];
			}

			u[pos] = u[pos - 3] + u[pos - 2] + u[pos - 1];
		}

		return u;
	}

	public static double[] tribonacciBest(double[] s, int n) {

		double[] tritab = Arrays.copyOf(s, n);
		for (int i = 3; i < n; i++) {
			tritab[i] = tritab[i - 1] + tritab[i - 2] + tritab[i - 3];
		}
		return tritab;

	}

}
