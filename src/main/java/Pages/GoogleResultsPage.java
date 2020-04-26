package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleResultsPage {
    @FindBy(how = How.CSS, using = "#res .g")
    private ElementsCollection results;

    @FindBy(how = How.CSS, using = "#rso > div:nth-child(1) > div > div > div.r > a")
    private SelenideElement bankPage;

    public ElementsCollection results() {
        return results;
    }

    public void bankPageClick() {
        bankPage.click();
    }
}
