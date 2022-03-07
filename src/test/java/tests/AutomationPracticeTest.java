package tests;

import base.SeleniumBase;
import org.testng.annotations.Test;
import pages.AutomationPracticePage;

public class AutomationPracticeTest extends SeleniumBase {
    AutomationPracticePage automationPracticePage;
    String name = "Tatev";

    @Test(priority = 0)
    public void radioBtnTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.click(automationPracticePage.getRadioBtn());
    }

    @Test(priority = 1)
    public void inputTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.input(automationPracticePage.getInput(), name);
    }

    @Test(priority = 2)
    public void selectTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.select(automationPracticePage.getSelect(), 1);
    }

    @Test(priority = 3)
    public void checkBoxTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.click(automationPracticePage.getCheckBox());
    }

    @Test(priority = 4)
    public void openWindowTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.windowHandle(automationPracticePage.getOpenWindowBtn(), "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
    }

    @Test(priority = 5)
    public void openTabTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.windowHandle(automationPracticePage.getOpenTabBtn(), "Rahul Shetty Academy");
    }

    @Test(priority = 6)
    public void alertCheck() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.input(automationPracticePage.getInputField(), name);
        automationPracticePage.click(automationPracticePage.getAlertBtn());
        automationPracticePage.checkAlertText("Hello " + name + ", share this practice page and share your knowledge");
        automationPracticePage.input(automationPracticePage.getInputField(), name);
        automationPracticePage.click(automationPracticePage.getConfirmBtn());
        automationPracticePage.checkAlertText("Hello " + name + ", Are you sure you want to confirm?");
    }

    @Test(priority = 7)
    public void webTableTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.tableHandle(automationPracticePage.getRow(), "Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C");
    }

    @Test(priority = 8)
    public void elementDisplayedTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.click(automationPracticePage.getHideBtn());
        automationPracticePage.isElementDisplayed(automationPracticePage.getTextField());
        automationPracticePage.click(automationPracticePage.getShowBtn());
        automationPracticePage.isElementDisplayed(automationPracticePage.getTextField());
        automationPracticePage.input(automationPracticePage.getTextField(), "Hey!");
    }

    @Test(priority = 9)
    public void hoverTest() {
        automationPracticePage = new AutomationPracticePage(SeleniumBase.driver);
        automationPracticePage.mouseHoverHandle(automationPracticePage.getMouseHover());
        automationPracticePage.click(automationPracticePage.getReload());
    }
}
