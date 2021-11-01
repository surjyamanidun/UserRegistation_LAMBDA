package lambdaexptest;
import org.junit.Assert;
import org.junit.Test;

public class EmailValidationTest {
    @Test
    public void email_Validation_One() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc@1yahoo.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Two() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc-100@yahoo.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void emailValidation_Three() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc.100@yahoo.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Four() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc111@abc.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Five() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc-100@abc.net");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Six() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc.100@abc.com.au");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Seven() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc@1.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Eight() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc@gmail.com.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Nine() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc+100@gmail.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Ten() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Eleven() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc@.com.my");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Twelve() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc123@gmail.a");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Thirteen() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc123@.com");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Fourteen() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc123@.com.com");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Fifteen() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email(".abc@abc.com");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Sixteen() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc()*@gmail.com");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Seventeen() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc@%*.com");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Eighteen() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc..2002@gmail.com");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Nineteen() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc.@gmail.com");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_Twenty() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc@abc@gmail.com");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_TwentyOne() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc@gmail.com.1a");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void email_Validation_TwentyTwo() {
        EmailValidation validation = new EmailValidation();
        boolean actualResult = validation.email("abc@gmail.com.aa.au");
        Assert.assertFalse(actualResult);
    }
}
