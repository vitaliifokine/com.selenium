package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
    @BeforeSuite
    public void setUp() {
        String dev = "https://the-internet.herokuapp.com/";
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.baseUrl = dev;
    }

    @AfterSuite
    public void quit() {
        Selenide.close();
    }
}
