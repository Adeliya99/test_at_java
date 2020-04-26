package Pages;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.page;

public class GooglePage {

    @FindBy(how = How.NAME, using = "q")
    private SelenideElement searchSpace;

    public GoogleResultsPage search(String query) {
        searchSpace.setValue(query).pressEnter();
        return page(GoogleResultsPage.class);
    }

    public static GooglePage openSite(String url) {
        return open(url, GooglePage.class);
    }
}

