package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearsOrderPage;
import com.cybertek.pages.SmartBearsPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SmartBears_StepDefinitions {
    
    SmartBearsPage smartBearsPage = new SmartBearsPage();
    SmartBearsOrderPage smartBearsOrderPage = new SmartBearsOrderPage();
    
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        
        String url = ConfigurationReader.getProperty("bearUrl");
        Driver.getDriver().get(url);
        smartBearsPage.userName.sendKeys("Tester");
        smartBearsPage.password.sendKeys("test");
        smartBearsPage.login.click();
        smartBearsOrderPage.orderButton.click();
    }
    
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productName) {
        BrowserUtils.sleep(2);
        Select select = new Select(smartBearsOrderPage.product);
        select.selectByVisibleText(productName);
    }
    
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        smartBearsOrderPage.quantity.sendKeys(quantity);
    }
    
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
        smartBearsOrderPage.customerName.sendKeys(customerName);
    }
    
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        smartBearsOrderPage.street.sendKeys(street);
    }
    
    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        smartBearsOrderPage.city.sendKeys(city);
    }
    
    @Then("User enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBearsOrderPage.state.sendKeys(state);
    }
    
    @Then("User enters {string} to zip")
    public void user_enters_to_zip(String zip) {
        smartBearsOrderPage.zip.sendKeys(zip);
    }
    
    @Then("User selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {
        
        for (WebElement eachCard : smartBearsOrderPage.visaTest) {
            if (eachCard.getText().contains(cardType)) {
                eachCard.click();
            }
        }
    }
    
    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNum) {
        smartBearsOrderPage.cardNum.sendKeys(cardNum);
    }
    
    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {
        smartBearsOrderPage.expDate.sendKeys(expDate);
    }
    
    @Then("User clicks process button")
    public void user_clicks_process_button() {
        smartBearsOrderPage.process.click();
        BrowserUtils.sleep(2);
        smartBearsOrderPage.viewAll.click();
    }
    
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {
        BrowserUtils.sleep(1);
        String actualName = smartBearsOrderPage.customer.getText();
        Assert.assertEquals(expectedName, actualName);
        
    }
    
}
