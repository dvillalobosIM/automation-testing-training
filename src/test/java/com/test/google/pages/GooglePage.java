package com.test.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Add Elements
}
