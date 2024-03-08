package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(TestBase.driver,this);
    }

    @FindAll({
            @FindBy(xpath = "//*[@data-testid=\"find-results-section-title\"]//*[@class=\"ipc-metadata-list-summary-item__t\"]")
    })
    public List<WebElement> bettyBlueFilmNameWebElementOnSerchPage;

    @FindAll({
            @FindBy(xpath = "//*[@data-testid=\"find-results-section-title\"]//*[@class=\"ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--no-wrap ipc-inline-list--inline ipc-metadata-list-summary-item__tl base\"]")
    })
    public List<WebElement> bettyBlueFilmYearWebElementOnSerchPage;

    public void clickFilmOnSearchPage(String filmName,String filmYear) {
        try {
            for (int i = 0; i<bettyBlueFilmNameWebElementOnSerchPage.size(); i++){
                if (bettyBlueFilmNameWebElementOnSerchPage.get(i).getText().equals(filmName) && bettyBlueFilmYearWebElementOnSerchPage.get(i).getText().equals(filmYear)){
                    TestBase.wait.until(ExpectedConditions.visibilityOf(bettyBlueFilmNameWebElementOnSerchPage.get(i)));
                    bettyBlueFilmNameWebElementOnSerchPage.get(i).click();
                }
            }
        }catch (Exception e){
            throw e;
        }
    }
}
