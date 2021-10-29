package lambdaexptest;
import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void firstName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.firstName("Manish");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void lastName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.lastName("Kumar");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.email("mkaubr007@gmail.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void phoneNumber_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.phoneNumber("+918002695700");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void password_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.password("qw1rt@Ms");
        Assert.assertTrue(actualResult);
    }
}
