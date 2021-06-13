package datasturctures.strings;


public class PermutationOfString {
	
	//Permutation using recursive call
		public static void permute(String str) {
			permuteRec(str, 0, str.length() - 1);
			System.out.println("Total Permutations = "+strCount);
			System.out.println("Total recursions = "+loopsCount);
		}

		static int strCount = 0;
		static int loopsCount = 0;

		/*
		 * recursive function recursive call between two indexes, exit when indexes
		 * becomes equal, take one position-- swap with all remaining one by one-- and
		 * recursive call for next to last index
		 */
		public static void permuteRec(String str, int i, int j) {

			if (i == j) {
				System.out.println(str);
				strCount++;
			} else {
				loopsCount++;
				for (int k = i; k <= j; k++) {
					str = swap(str, i, k);
					permuteRec(str, i + 1, j);
					// str=swap(str, i, k);
				}
			}
		}

		// method to swap two indexes
		public static String swap(String str, int i, int j) {
			char[] arr = str.toCharArray();
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			return String.valueOf(arr);
		}

		public static void main(String[] args) {
			permute("ABCD");
		}
		
}
