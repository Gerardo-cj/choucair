package com.choucair.generic;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class WebDriverDOM extends PageObject {

    private void JSClickElement(WebElementFacade element) {
        JavascriptExecutor ex = (JavascriptExecutor) getDriver();
        ex.executeScript("arguments[0].click();", element);
    }

    protected void clickElement(WebElementFacade element) {
        element.click();
    }

    protected void waitForElementAndClick(WebElementFacade element) {
        element.waitUntilVisible().click();
    }

    protected String getTextFromElement(WebElementFacade element) {
        return element.getText();
    }

    protected void sendKeyElement(WebElementFacade webElement, String value) {
        webElement.sendKeys(value);
    }

    protected void typeAndEnterElement(WebElementFacade webElement, String value) {
        webElement.typeAndEnter(value);
    }

    protected void clickElementForAList(List<WebElement> listElement, String value) {
        for (WebElement element : listElement) {
            if (element.getText().equals(value)) {
                element.click();
                break;
            }
        }
    }


    protected void selectOptionFromComboListAndClick(WebElement selectOption, String optionValue) {

        Select select = new Select(selectOption);
        for (WebElement webElement : select.getOptions()) {
            if (webElement.getText().contains(optionValue)) {
                webElement.click();
                break;
            }
        }
    }


}