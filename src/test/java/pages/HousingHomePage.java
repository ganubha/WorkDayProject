package pages;


import io.cucumber.datatable.DataTable;
import main.TestRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HousingHomePage extends TestRunner {

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'dropdown-sort')]/ul")
    private WebElement drpdwn_sort;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'dropdown-sort')]/ul/li/a")
    private List<WebElement> sortList;

    @FindBy(how = How.XPATH, using = "//input[@id='query']")
    private WebElement searchBox;

    @FindBy(how = How.CSS, using = ".icon.icon-search")
    private WebElement searchIcon;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'price ↑ ')]")
    private WebElement sortbypriceasc;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'price ↓ ')]")
    private WebElement sortbypricedsc;

    public HousingHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSortDropDown() {
        drpdwn_sort.click();
    }

    public void validateSortDropDown(DataTable dataTable) {
        List<String> dropdownValue = dataTable.asList(String.class);
        ; //outer List<> is rows, inner List<> is cells

        ArrayList<String> expecteddropdownList = new ArrayList<String>();

        expecteddropdownList.add(dropdownValue.get(0));
        expecteddropdownList.add(dropdownValue.get(1));
        expecteddropdownList.add(dropdownValue.get(2));
        expecteddropdownList.add(dropdownValue.get(3));

        System.out.println(expecteddropdownList);

        ArrayList<String> actualdropdownList = new ArrayList<String>();

        for (WebElement ele : sortList)
            actualdropdownList.add(ele.getText());

        System.out.println(actualdropdownList);

        boolean boolval = expecteddropdownList.equals(actualdropdownList); //returns true because lists are equal


        Assert.assertEquals(expecteddropdownList, actualdropdownList);
    }

    public void searchText(String item) {
        searchBox.sendKeys(item);
        searchIcon.click();
    }

    public void validateSortDropDownafterSearch(DataTable dataTable) {
        List<String> dropdownValue = dataTable.asList(String.class);
        ; //outer List<> is rows, inner List<> is cells

        ArrayList<String> expecteddropdownList = new ArrayList<String>();

        expecteddropdownList.add(dropdownValue.get(0));
        expecteddropdownList.add(dropdownValue.get(1));
        expecteddropdownList.add(dropdownValue.get(2));
        expecteddropdownList.add(dropdownValue.get(3));
        expecteddropdownList.add(dropdownValue.get(4));

        System.out.println(expecteddropdownList);

        ArrayList<String> actualdropdownList = new ArrayList<String>();

        for (WebElement ele : sortList)
            actualdropdownList.add(ele.getText());

        System.out.println(actualdropdownList);

        boolean boolval = expecteddropdownList.equals(actualdropdownList); //returns true because lists are equal


        Assert.assertEquals(expecteddropdownList, actualdropdownList);
    }

    public void clickOnSortByPriceAsc() {
        sortbypriceasc.click();
    }

    public void clickOnSortByPriceDsc() {
        sortbypriceasc.click();
    }

}


