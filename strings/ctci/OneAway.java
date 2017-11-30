package arrays.strings.ctci;

public class OneAway {

	public static void main(String[] args) {
	
		String s1 = "pale";
		String s2 = "pxleer";
		
		if(s2.length() > s1.length() +1){
			System.out.println("Nothing found!");
			
		}else{
		
		if(s2.length() == s1.length() +1){
			System.out.println("Insertion found: " + checkInsertion(s1, s2)); 	
		}else if(s2.length() == s1.length() -1){
			System.out.println("Deletion found: " + checkInsertion(s2, s1)); 	
		}else{
			System.out.println("Replacement found: " + checkReplacement(s1, s2)); 	
		}
		}
	}

	public static boolean checkInsertion(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;

		while (index1 < s1.length() && index2 < s2.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			}else{
				index1++;
				index2++;
			}
			
		}
		return true;
	}

	public static boolean checkReplacement(String s1, String s2) {
		boolean found = false;
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (found) {
					return false;
				}
				found = true;
			}

		}

		return found;
	}

}
