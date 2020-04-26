import Pages.GooglePage;
import Pages.GoogleResultsPage;
import Pages.BankPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {
  @BeforeTest
  public void OpenGoogle() {
    Configuration.browser = "chrome";
  }

  @Test
  public void OpenBankTest() {

    GooglePage google = GooglePage.openSite("https://www.google.com/");
    GoogleResultsPage res = google.search("Открытие");
    Assert.assertTrue(res.results().toString().contains("www.open.ru"));

    res.bankPageClick();

    BankPage onBankPage = page(BankPage.class);

    Assert.assertTrue(onBankPage.getSaleUSD() > onBankPage.getBuyUSD());
    Assert.assertTrue(onBankPage.getSaleEUR() > onBankPage.getBuyEUR());
  }

  @AfterTest
  public void testShutDown (){
    WebDriverRunner.clearBrowserCache();
  }
}





