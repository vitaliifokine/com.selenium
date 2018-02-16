package tests;

import com.codeborne.selenide.Condition;
import domainUser.User;
import org.testng.annotations.Test;
import pages.AuthorizationPage;

public class BasicAuthorization extends BaseTests {

    @Test
    public void testValidCredentialsUrLFlow() {
        User user = new User("admin", "admin");
        new AuthorizationPage()
                .inputOnURLUserPasswordCredentials(user.getUsername(), user.getPassword())
                .getAuthentificationMessage()
                .should(Condition.text("Congratulations! You must have the proper credentials. "));
    }

    @Test
    public void testValidCredentialsAlert() {
    }

    @Test
    public void testInvalidCredentialsAlert() {
    }
}
