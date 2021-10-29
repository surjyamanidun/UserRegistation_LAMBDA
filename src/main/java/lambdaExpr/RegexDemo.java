package lambdaExpr;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RegexDemo regexDemo = new RegexDemo();
		System.out.println("Enter first name");
		regexDemo.firstName();
	}
	/*
	 * method to validate first name
	 */
	public void firstName() {
		String input = sc.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
