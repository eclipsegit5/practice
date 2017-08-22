package practice1;

public class SmallestLargest {

	public static void main(String[] args) {
		int[] n = { 10, 23, 56, 13, 34, 89, 809, 12 };

		int l = n[0];

		int s = n[0];

		for (int i = 0; i < n.length; i++) {

			if (n[i] > l) {

				l = n[i];

			} else if (n[i] < s) {

				s = n[i];
			}
		}
		System.out.println("Largest number: " + l);

		System.out.println("Smallest number: " + s);

	}

}
