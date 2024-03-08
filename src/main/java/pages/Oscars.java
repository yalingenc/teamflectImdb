package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Oscars {
    WebElement oscarYear;
    List<WebElement> oscarPageFilmInformations;

    public Oscars (){
        PageFactory.initElements(TestBase.driver,this);
    }
    Actions actions = new Actions(TestBase.driver);

    @FindBy(xpath = "//*[@data-testid=\"symphony-NavigationWidget\"]//h1")
    public WebElement oscarPageTitle;

    @FindAll({
            @FindBy(xpath = "//*[@class=\"ipc-tabs ipc-tabs--base ipc-tabs--align-left\"]/li")
    })
    public List<WebElement> elements;

    @FindAll({
            @FindBy(xpath = "//*[@class=\"ipc-page-section ipc-page-section--base ipc-page-section--tp-none ipc-page-section--bp-none\"]//a")
    })
    public List<WebElement> yearElements;

    @FindAll({
            @FindBy(xpath = "//*[@class=\"sc-69e49b85-3 dIOekc\"]//li/div//li/a")
    })
    public List<WebElement> filmInformations;

    @FindBy(xpath = "//*[text()=\"Betty Blue\"]")
    public WebElement bettyBlueElement;

    @FindBy(id = "home_img_holder")
    public WebElement homePageWebElement;

    public void click(WebElement element) {
        TestBase.wait.until(ExpectedConditions.visibilityOf(element));
        actions.moveToElement(element);
        actions.perform();
        element.click();
    }

    public String isOscarPageCorrect(WebElement element){
        TestBase.wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public WebElement getElementFromList(List<WebElement> elements, String year){
            for (WebElement oscarYearElement : elements){
                if (oscarYearElement.getText().equals(year)){
                    oscarYear = oscarYearElement;
                }
            }
            return oscarYear;
    }

    public void saveFilmInformationsOnOscarsPage(List<WebElement> elements){
        oscarPageFilmInformations = elements;
    }

}
