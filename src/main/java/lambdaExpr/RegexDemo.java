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
        System.out.println("Enter last name");
        regexDemo.lastName();
        System.out.println("Enter email");
        regexDemo.email();
        System.out.println("Enter mobile number");
        regexDemo.phoneNumber();
        System.out.println("Enter password");
        regexDemo.password();
    }
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

    public void lastName() {
        String input = sc.next();
        String regex = "^[a-zA-Z]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public void email() {
        String input = sc.next();
        String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}+.([a-z]{2,3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public void phoneNumber() {
        String input = sc.next();
        String regex = "(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public void password() {
        String input = sc.next();
        String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
