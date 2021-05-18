package pages;

import main.TestRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CraigsListOrgHomePage extends TestRunner {


    @FindBy(how = How.XPATH, using = "//a[text()='english']")
    private WebElement userLanguage;

    @FindBy(how = How.CSS, using = ".hhh")
    private WebElement housingTab;

    public CraigsListOrgHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectuserLang() {
        userLanguage.click();

    }

    public void clickHousingTab() {
        housingTab.click();

    }
}
