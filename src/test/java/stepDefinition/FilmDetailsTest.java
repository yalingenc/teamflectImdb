package stepDefinition;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FilmPage;
import pages.HomePage;
import pages.Oscars;
import pages.SearchPage;

public class FilmDetailsTest {

    HomePage homePage = new HomePage();
    Oscars oscars = new Oscars();
    SearchPage searchPage = new SearchPage();
    FilmPage filmPage = new FilmPage();


    @Given("User should opens the imdb site")
    public void userShouldOpensTheImdbSite() {
        Assert.assertEquals("IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows",homePage.isSiteCorrect(homePage.imdbTitle));
        homePage.click(homePage.cookieDecline);
    }

    @When("User clicks menu button")
    public void userClicksMenuButton() {
        homePage.click(homePage.clickMenu);
    }

    @And("User clicks Oscars selection under Awards and Event section")
    public void userClicksOscarsSelectionUnderAwardsAndEventSection() {
        homePage.click(homePage.clickOscars);
    }

    @Then("User verifies that oscars page should opened")
    public void userVerifiesThatOscarsPageShouldOpened() {
        Assert.assertEquals("OSCARS",oscars.isOscarPageCorrect(oscars.oscarPageTitle));
    }

    @And("User should select {string} from list")
    public void userShouldSelectFromList(String year) {
        oscars.click(oscars.getElementFromList(oscars.elements,year));
    }

    @And("User clicks {string} from list")
    public void userClicksFromList(String year) {
        oscars.click(oscars.getElementFromList(oscars.yearElements,year));
    }

    @And("User clicks {string} film under Best Foreign Language Section")
    public void userClicksFilmUnderBestForeignLanguageSection(String filmName) {
        oscars.click(oscars.bettyBlueElement);
    }

    @And("User records Director, Writer and Stars information about {string}")
    public void userRecordsDirectorWriterAndStarsInformationAbout(String arg0) {
        oscars.saveFilmInformationsOnOscarsPage(oscars.filmInformations);
    }

    @And("User navigates home page")
    public void userNavigatesHomePage() {
        oscars.click(oscars.homePageWebElement);
    }

    @And("User enters {string} on search area")
    public void userEntersOnSearchArea(String filmName) {
        homePage.setText(homePage.homePageSearchWebElement,filmName);
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        homePage.click(homePage.searchButton);
    }

    @And("User clicks {string} film which made in {string}")
    public void userClicksFilmWhichMadeIn(String filmName, String filmYear) {
        searchPage.clickFilmOnSearchPage(filmName,filmYear);
    }

    @And("User should verifies that film informations matched")
    public void userShouldVerifiesThatFilmInformationsMatched() {
        Assert.assertTrue(filmPage.isFilmInformationsEqual(oscars.filmInformations));
    }
}
