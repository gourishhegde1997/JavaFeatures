package javafeatures.regex;

import java.util.regex.Pattern;

public class RegexTest2 {

	private boolean checkValidEmail(String emailId) {
		boolean isValid = false;
		String pattern = "^[a-zA-Z0-9.-]+@[a-zA-Z]+\\.(com|in|org){1}";
//		String pattern = "^[a-zA-Z0-9.-]+@[a-zA-Z\\s-]+";
		isValid = Pattern.matches(pattern, emailId);
		return isValid;
	}
	public static void main(String[] args) {
		String emailId = "gourishdhegde@gmail.com";
//		String emailId = "gourishdhegde@gmail hi-";
		System.out.println(new RegexTest2().checkValidEmail(emailId));
	}

}
