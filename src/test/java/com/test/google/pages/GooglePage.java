package com.test.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    public WebElement searchInput;

    @FindBy(className = "sA5rQ")
    public WebElement result1FB;

    @FindBy(className = "LC20lb")
    public WebElement result1TW;
}
