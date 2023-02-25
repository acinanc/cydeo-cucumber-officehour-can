package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    //pagefactory rrquired if we use @FindBy otherwise not required
    public ElementsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void clickOption(String option){
        String locator="//li[.='"+option+"']";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}
