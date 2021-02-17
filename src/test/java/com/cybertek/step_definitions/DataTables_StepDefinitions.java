package com.cybertek.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTables_StepDefinitions {
    
    
    
    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> fruitList) {
        
        /*
        List<String> actualFooterLinks = new ArrayList<>();
        for (WebElement eachLink : googleSearchPage.footerLinks) {
            actualFooterLinks.add(eachLink.getText());
        }
        Assert.assertEquals(expectedFooterLinks,actualFooterLinks);
    }
         */
        System.out.println("fruitList.size() = " + fruitList.size());
        System.out.println("fruitList = " + fruitList);
        
        for (String eachFruit : fruitList) {
            System.out.println("eachFruit = " + eachFruit);
        }
        
        
        
    }
    
    
}
