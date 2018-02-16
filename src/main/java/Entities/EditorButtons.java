package Entities;

public enum EditorButtons {
    BOLD("#mceu_3>button"),
    ITALIC("#mceu_4>button"),
    REDO("#mceu_1>button"),
    BULLET_LIST("#mceu_9>button"),
    UNDO("#mceu_0>button");

    private String editorButton;

    EditorButtons(String editorButton) {
        this.editorButton = editorButton;
    }

    public String getEditorButton() {
        return editorButton;
    }
}
