package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import main.TestRunner;
import pages.CraigsListOrgHomePage;

public class CraigsListOrgHomePageSteps extends TestRunner {

    CraigsListOrgHomePage homePage = new CraigsListOrgHomePage(driver);

    @Given("the user opens the website url")
    public void theUserOpensTheWebsiteHttpsHelsinkiCraigslistOrg() {
        homePage.selectuserLang();
    }

    @When("the user clicks on the housing category")
    public void theUserClicksOnTheHousingCategory() {
        homePage.clickHousingTab();
    }

    @And("the user should be navigated to the housing home page")
    public void theUserShouldBeNavigatedToTheHousingHomePage() {
    }
}
