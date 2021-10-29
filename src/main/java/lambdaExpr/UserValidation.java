package lambdaExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static boolean firstName(String firstName) throws UserValidationException {
        try {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }

    public static boolean lastName(String lastName) throws UserValidationException {
        try {
            String regex = "^[a-zA-Z]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lastName);
            return matcher.matches();
        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }

    public static boolean email(String email) throws UserValidationException {
        try {
            String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z0-9]+.(com|net)(.[a-z]{2,3}){0,1}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }

    public static boolean phoneNumber(String phoneNumber) throws UserValidationException {
        try {
            String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }

    public static boolean password(String password) throws UserValidationException {
        try {
            String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }
}
