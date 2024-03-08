package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.TestUtil;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class FilmPage {

    boolean isFilmInfoCorrect = false;
    public FilmPage (){
        PageFactory.initElements(TestBase.driver,this);
    }

    @FindAll({
            @FindBy(xpath = "//*[@class=\"sc-69e49b85-3 dIOekc\"]//li/div//li/a")
    })
    public List<WebElement> filmPageInformations;

    public boolean isFilmInformationsEqual(List<WebElement> elements){
        if (elements.containsAll(filmPageInformations)){
            isFilmInfoCorrect = true;
        }
        return isFilmInfoCorrect;
    }
}
