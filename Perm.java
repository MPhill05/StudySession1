
public class Perm {
	/**
	 * Calls private helper method that computes all permutations in given string
	 * @param str given string to compute all permutations on
	 */
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	/**
	 * Recursively computers the permutation of param str using prefix as a mediator
	 * @param prefix helper string
	 * @param str 
	 */
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

	public static void main(String[] args) {
		permutation("abc");
	}
	
}
