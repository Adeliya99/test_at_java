package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div/div/div/div[2]" +
            "/table/tbody/tr[2]/td[2]/div/span")
        private SelenideElement sBuyUSD;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div/div/div/div[2]" +
            "/table/tbody/tr[2]/td[4]/div/span")
    private SelenideElement sSaleUSD;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div/div/div/div[2]" +
            "/table/tbody/tr[3]/td[2]/div/span")
    private SelenideElement sBuyEUR;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div/div/div/div[2]" +
            "/table/tbody/tr[3]/td[4]/div/span")
    private SelenideElement sSaleEUR;

    public float getBuyUSD() {
        float buyUSD = Float.parseFloat(sBuyUSD.getText().replace(",", "."));
        return buyUSD;
    }
    public float getSaleUSD() {
        float saleUSD = Float.parseFloat(sSaleUSD.getText().replace(",", "."));
        return saleUSD;
    }
    public float getBuyEUR() {
        float buyEUR = Float.parseFloat(sBuyEUR.getText().replace(",", "."));
        return buyEUR;
    }
    public float getSaleEUR() {
        float saleEUR = Float.parseFloat(sSaleEUR.getText().replace(",", "."));
        return saleEUR;
    }
}




