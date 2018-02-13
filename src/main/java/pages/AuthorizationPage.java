package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {
    private SelenideElement authentificationMessage = $("#content > div > p");
    private static String url = "/basic_auth";

    public SelenideElement getAuthentificationMessage() {
        return authentificationMessage;
    }

    public AuthorizationPage inputOnURLUserPasswordCredentials(String user, String password)  {
        Selenide.open(new StringBuilder().append("http://")
                .append(user).append(":")
                .append(password)
                .append("@the-internet.herokuapp.com/basic_auth")
                .toString());
      return this;
    }
}
