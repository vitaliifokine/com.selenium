package Entities;

public enum FormatStyle {
    BOLD("#mceu_35"),
    ITALIC(".mce-ico.mce-i-italic"),
    UNDERLINE("#mceu_37"),
    STRIKETHROUGH("#mceu_38"),
    SUPERSCRIPT("#mceu_39"),
    SUBSCRIPT("#mceu_40");

    private String formatStyle;

    FormatStyle(String formatStyle) {
        this.formatStyle = formatStyle;
    }

    public String getFormatStyle() {
        return formatStyle;
    }
}
