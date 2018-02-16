package tests;

import Entities.EditorButtons;
import Entities.FormatStyle;
import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.EditorPage;
import pages.MainPage;

public class EditorTests extends BaseTests {

    @BeforeClass
    public void createNewDocument() {
        new MainPage().openEditorPage()
                .createNewDocument();
    }

    @Test
    public void testBoldStyleOptionsChecker() {
        new EditorPage()
                .clickBarButton(EditorButtons.BOLD)
                .styleCheckerBar.shouldHave(Condition.text("strong"));
    }

    @Test
    public void testFormatStyle() {
        new EditorPage()
                .setFormatStyle(FormatStyle.ITALIC)
                .styleCheckerBar.shouldHave(Condition.text("em"));
    }

    @Test
    public void testTextInput() {
        String testText = "Check editor text";
        new EditorPage()
                .fillTheText(testText);
    }
}
