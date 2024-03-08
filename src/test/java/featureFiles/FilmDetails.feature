Feature: imdb_test

  Scenario: Verify Film Details
    Given User should opens the imdb site
    When User clicks menu button
    And User clicks Oscars selection under Awards and Event section
    Then User verifies that oscars page should opened
    And  User should select "1980s" from list
    And User clicks "1987" from list
    And User clicks "Betty Blue" film under Best Foreign Language Section
    And User records Director, Writer and Stars information about "Betty Blue"
    And User navigates home page
    And User enters "Betty Blue" on search area
    And User clicks search button
    And User clicks "Betty Blue" film which made in "1986"
    And User should verifies that film informations matched
