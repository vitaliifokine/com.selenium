package pages;

import static pages.Page.open;

public class MainPage {

    public EditorPage openEditorPage() {
        open(EditorPage.class);
        return new EditorPage();
    }
}
