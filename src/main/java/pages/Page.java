package pages;

import com.codeborne.selenide.Selenide;

import java.lang.reflect.Field;

public class Page {
    public static <T> T open(Class<T> tClass) {
        try {
            Field url = tClass.getDeclaredField("url");
            url.setAccessible(true);
            String pageUrl = (String) url.get(tClass);
            Selenide.open(pageUrl);
            return tClass.newInstance();
        } catch (Exception e) {
            System.out.println("Could not open page " + tClass);
            throw new RuntimeException(e);
        }
    }
}
