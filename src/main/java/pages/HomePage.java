package pages;

import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {

    TestBase testBase;

    public HomePage (){
        testBase = new TestBase();
        PageFactory.initElements(testBase.driver,this);
    }

    @FindBy(id = "imdbHeader-navDrawerOpen")
    public WebElement clickMenu;

    @FindBy(xpath = "//span[label/span='Awards & Events']//*[text()='Oscars']")
    public WebElement clickOscars;

    @FindBy(xpath = "/html/head/title")
    public WebElement imdbTitle;

    @FindBy(xpath = "//*[@data-testid =\"reject-button\"]")
    public WebElement cookieDecline;

    @FindBy(xpath = "//*[@class=\"imdb-header-search__input searchTypeahead__input react-autosuggest__input\"]")
    public WebElement homePageSearchWebElement;

    @FindBy(id = "suggestion-search-button")
    public WebElement searchButton;

    public void click(WebElement element) {
        testBase.wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public String isSiteCorrect(WebElement element){
        return testBase.driver.getTitle();

    }

    public void setText(WebElement element,String filmName){
        testBase.wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor jse = (JavascriptExecutor)testBase.driver;
        jse.executeScript("arguments[0].setAttribute('value', '" + filmName +"')", element);
        //element.sendKeys(filmName);
    }
}
