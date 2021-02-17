package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPages {
    
    public EtsySearchPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;
    
    
    
    @FindBy(xpath = "submit")
    public WebElement submit;
    
    
    
}
