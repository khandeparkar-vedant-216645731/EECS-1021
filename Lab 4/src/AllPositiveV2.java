
public class AllPositiveV2 {

	public static void main(String[] args) {
		int[] ns = {2, 3, -1, 4, -7};
		boolean allPos = true;
		for (int i = 0; i < ns.length; i++) {
			// This is wrong without the accumulation
			allPos = ns[i] > 0;
		}
		System.out.println("All elements in the array are positive: " + allPos);
	}
}
