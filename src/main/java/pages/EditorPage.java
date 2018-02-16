package pages;

import Entities.EditorButtons;
import Entities.FormatStyle;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class EditorPage extends Page {
    private SelenideElement fileBar = $("#mceu_15-open");
    private SelenideElement newDocument = $("#mceu_32");
    private SelenideElement editorTextLayout = $("#tinymce");
    private SelenideElement defaultPureStyleOnStyleChecker = $("#mceu_29-0");
    private SelenideElement boldStyle = $("#mceu_3>button");
    public SelenideElement styleCheckerBar = $("#mceu_28-body");
    private SelenideElement formatBar = $("#mceu_18-open");

    private static String url = "/tinymce";

    public EditorPage createNewDocument() {
        fileBar.click();
        newDocument.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    public EditorPage setFormatStyle(FormatStyle formatStyle) {
        formatBar.click();
        $(formatStyle.getFormatStyle()).waitUntil(Condition.visible, 8000).click();
        return this;
    }

    public EditorPage fillTheText(String textForInput) {
        editorTextLayout.setValue(textForInput);
        return this;
    }

    public EditorPage checkDefaultStyle() {
        defaultPureStyleOnStyleChecker.shouldBe(Condition.visible);
        return this;
    }

    public EditorPage clickBarButton(EditorButtons editorButtons) {
        $(editorButtons.getEditorButton()).click();
        return this;
    }


}
