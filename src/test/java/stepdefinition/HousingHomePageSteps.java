package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.TestRunner;
import pages.HousingHomePage;

public class HousingHomePageSteps  extends TestRunner {

    HousingHomePage housingPage = new HousingHomePage(driver);
    @Given("user is on the housing home page")
    public void userIsOnTheHousingHomePage() {
    }

    @When("user navigates to the sorting option")
    public void userNavigatesToTheSortingOption() {

    }

    @And("user clicks on the sort functionality dropdown")
    public void userClicksOnTheSortFunctionalityDropdown() {
        housingPage.clickOnSortDropDown();
    }

    @Then("user should get default sorting functionalities")
    public void userShouldGetDefaultSortingFunctionalities(DataTable table) {
        housingPage.validateSortDropDown(table);
    }

    @Then("user type {string} in the search box")
    public void userTypeInTheSearchBox(String arg0) {
        housingPage.searchText(arg0);
    }

    @And("user clicks on the search icon next to the search box")
    public void userClicksOnTheSearchIconNextToTheSearchBox() {

    }

    @Then("user navigates to the sorting functionality")
    public void userNavigatesToTheSortingFunctionality() {
    }

    @And("user clicks on the sorting dropdown")
    public void userClicksOnTheSortingDropdown() {
        housingPage.clickOnSortDropDown();
    }

    @Then("user should get sorting options")
    public void userShouldGetSortingOptions(DataTable table) {
        housingPage.validateSortDropDownafterSearch(table);
    }

    @When("user navigates to the sort options dropdown")
    public void userNavigatesToTheSortOptionsDropdown() {
    }

    @And("user clicks on the sort dropdown")
    public void userClicksOnTheSortDropdown() {
        housingPage.clickOnSortDropDown();
    }

    @Then("user should be able to see price up option")
    public void userShouldBeAbleToSeePriceUpOption() {
        housingPage.clickOnSortByPriceAsc();
    }

    @And("user clicks on the price up option")
    public void userClicksOnThePriceUpOption() {
        housingPage.clickOnSortByPriceDsc();
    }

    @Then("user should be able to see the housing list")
    public void userShouldBeAbleToSeeTheHousingList() {
    }

    @Then("user should be able to see price down option")
    public void userShouldBeAbleToSeePriceDownOption() {
    }

    @And("user clicks on the price down option")
    public void userClicksOnThePriceDownOption() {
    }
}
