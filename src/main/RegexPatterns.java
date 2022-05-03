package main;

/**
 * 
 * @author simon kuang
 *
 */
public class RegexPatterns {
	public static double test(int x) {
		return x+x;
	}
	/**
	 * Test name.
	 * 
	 * Provide a regex pattern that validates a person's first and last name. 
	 * Each name should be capitalized and should not contain any punctuation 
	 * characters except a "-" or " ". You should limit the pattern to only two names.
	 * 
	 * Notes: 
	 * 	- Hyphenated names (up to two names) counts as one name (see case 2)
	 * 	- Names may begin with 1 or 2 capital letters, but cannot have the 
	 * 		expected apostrophe (see cases 3 and 4).
	 * 
	 *
	 * @param name the name
	 * @return true, if successful
	 */
	
	public static boolean testName(String name){
		
		return name.matches("([A-Z]{1,2}[a-z]+[-']*[A-Z]*[a-z]*)\s([A-Z]{1,2}[a-z]+)");
		
	}
	
	/**
	 * Test name.
	 * 
	 * Provide a Regex pattern that matches Atlanta phone numbers. The format 
	 * should be "(###)###-####" and the only valid area codes are 404,678 and
	 * 770.
	 *
	 * @param name the name
	 * @return true, if successful
	 */
	public static boolean testPhoneNumber(String phoneNumber){
		return phoneNumber.matches("[(](404|678|770)[)][0-9]{3}[-][0-9]{4}");
	}
	
	/**
	 * Test email.
	 * 
	 * Provide a Regex pattern that validates an email. The email should be
	 * broken up into the following sections:
	 * 
	 * 1) any word character, digit, underscore, dash and period combination,
	 *    but must start with a letter
	 * 2) the only @
	 * 3) any word character, digit, underscore and dash combination, but must
	 *    start with a letter
	 * 4) a single period
	 * 5) valid emails must end in com, org or net
	 *
	 * @param email the email
	 * @return true, if successful
	 */
	public static boolean testEmail(String email){
		
		return email.matches("[A-Za-z]+[A-Za-z0-9_.-]+[@][A-Za-z]+[A-Za-z0-9_.-]+[.](com|org|net)");
	}
	
	/**
	 * Test address.
	 * 
	 * Provide a regex pattern to validate a mailing address. The address must
	 * 1) start with a number, 1-5 digits in length
	 * 1.5) whitespace
	 * 2) Some combination of letters, numbers, spaces, period, and hyphens for the street 
	 * 3) break to a newline
	 * 4) The city - same rules as (2), but no numbers
	 * 5) possible whitespace
	 * 6) optional comma
	 * 7) possible whitespace
	 * 8) 2 capital characters as state
	 * 9) some whitespace
	 * 10) a 5 digit zipcode.
	 * 
	 * The state characters can be any 2 capital letters, they do not  need to
	 * actually match a real state.
	 *
	 * @param address the address
	 * @return true, if successful
	 */
	public static boolean testAddress(String address){
		String streetNumber = "[0-9]{1,5}";
		String whiteSpace = "[\s]";
		String street = "[A-Za-z0-9.\s-]+";
		String newLine = "[\n]";
		String city = "[A-Za-z.\s-]+";
		String pWhiteSpace = "[\s]?";
		String optionalComma = "[,]?";
		String state = "[A-Z][A-Z]";
		String someWhiteSpace = "[\s]+";
		String zip = "[0-9]{5}";
	
		return address.matches(streetNumber + whiteSpace + street +newLine
								+city +pWhiteSpace + optionalComma + pWhiteSpace
								+state + someWhiteSpace + zip);
	}
	
	/**
	 * Test java executable.
	 * 
	 * Provide a regex pattern that will check a string of text (presumably
	 * from a .java file, but that is not important here) to see if it contains
	 * "public static void main(String[] args)".
	 *
	 * @param java the Java string
	 * @return true, if successful
	 */
	public static boolean testJavaExecutable(String java){
		
		String ignore = "[a-zA-Z0-9\n\s/*\"]*";
		return java.matches(ignore + "public[\s]static[\s]void[\s]main\\(String\\[\\]\sargs\\)" +ignore);
	}

}