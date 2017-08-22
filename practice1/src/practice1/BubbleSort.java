package practice1;

public class BubbleSort {
	public static void main(String[] args) {
		int[] n = { 23, 13, 56, 89, 34 };
		bubblesort(n);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	private static void bubblesort(int[] n) {
		int x = n.length;
		int y = 0;

		for (int i = 0; i < x; i++) {
			for (int j = 1; j < (x - i); j++) {

				if (n[j - 1] > n[j]) {
					y = n[j - 1];
					n[j - 1] = n[j];
					n[j] = y;
				}

			}
		}

	}

}
