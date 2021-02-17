Feature: Wikipedia search feature


  Scenario:
    Given User is on Wikipedia home page
    When  User types "Steve Jobs" in the wiki search box
    And  User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


  Scenario:
    Given User is on Wikipedia home page
    When  User types "Steve Jobs" in the wiki search box
    And  User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header


  @wiki
  Scenario Outline: Wikipedia search feature
    Given User is on Wikipedia home page
    When  User types "<searchValue>" in the wiki search box
    And  User clicks wiki search button
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedTitle>" is in the wiki title

    Examples: search terms we are going to search in wikipedia
      | searchValue  | expectedMainHeader | expectedTitle |
      | Steve Jobs   | Steve Jobs         | Steve Jobs    |
      | Bruce Lee    | Bruce Lee          | Bruce Lee     |
      | Kobe Bryant  | Kobe Bryant        | Kobe Bryant   |
      | Elon Musk    | Elon Musk          | Elon Musk     |
      | Bill Gates   | Bill Gates         | Bill Gates    |
      | Chuck Norris | Chuck Norris       | Chuck Norris  |
      | Marie Curie  | Marie Curie        | Marie Curie   |

