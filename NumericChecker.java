//2.	Write a function “IsNumeric” to check whether the given string is numeric
	public class NumericChecker {
	
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;
	
	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)) return false;
	        }
	
	        return true;
	    }
	
	    public static void main(String[] args) {
	        String test1 = "12345";
	        String test2 = "12a34";
            String test3 = "";	
	        System.out.println("Is \"" + test1 + "\" numeric? " + isNumeric(test1));
	        System.out.println("Is \"" + test2 + "\" numeric? " + isNumeric(test2));
            System.out.println("Is \"" + test3 + "\" numeric? " + isNumeric(test3));
    }
}
