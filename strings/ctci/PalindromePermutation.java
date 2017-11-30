package arrays.strings.ctci;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPermute("tact coa"));

	}

	public static boolean isPermute(String s) {
		String str = s.toLowerCase().replace(" ", "");
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int[] arr = new int[26];
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			arr[alpha.indexOf(str.charAt(i))] += 1;

		}

		if (str.length() % 2 == 0) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					if (arr[1] % 2 == 0) {
						count++;
					}

				}

			}
			if (2 * count == str.length()) {
				return true;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					if (arr[1] % 2 == 0) {
						count++;
					} else {
						if (arr[i] == 1)
							count++;
					}

				}
			}
			if ((2 * count) - 1 == str.length()) {
				return true;
			}

		}
		return false;
	}
}
