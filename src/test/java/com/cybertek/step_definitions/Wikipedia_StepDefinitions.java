package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wikipedia_StepDefinitions {
    
    WikipediaSearchPage wiki = new WikipediaSearchPage();
    
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        
        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);
    }
    
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wiki.submit.click();
        
    }
    
    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String name) {
        wiki.searchBox.sendKeys(name);
    }
    
    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String name) {
        String expected = name + " - Wikipedia";
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(actual.equalsIgnoreCase(expected));
        
    }
    
    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedHeader) {
        String actualHeader = wiki.mainHeader.getText();
        Assert.assertEquals(actualHeader, expectedHeader);
        
    }
}
