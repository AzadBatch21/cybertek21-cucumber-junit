Feature: SmartBear order process


  @smart
  Scenario Outline: SmartBears search feature
    Given User is logged into SmartBear Tester account and on Order page
    # User fills out the form as followed from the table below:
    When User selects "<product>" from product dropdown
    When User enters "<quantity>" to quantity
    When User enters "<customer name>" to costumer name
    When User enters "<street>" to street
    When User enters "<city>" to city
    Then User enters "<state>" to state
    Then User enters "<zip>" to zip
    Then User selects "<cardType>" as card type
    Then User enters "<card number>" to card number
    Then User enters "<expiration date>" to expiration date
    Then User clicks process button
    Then User verifies "<ExpectedName>" is in the list


    Examples: search terms we are going to search
      | product     | quantity | customer name   | street      | city        | state | zip   | cardType | card number  | expiration date | ExpectedName    |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60004 | Visa     | 313313133315 | 12/22           | Ken Adams       |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago     | IL    | 60656 | Visa     | 113313133316 | 11/22           | Joey Tribbiani  |
      | ScreenSaver | 5        | Rachel Green    | Michigan st | Chicago     | IL    | 60056 | Visa     | 313313133317 | 10/22           | Rachel Green    |
      | MyMoney     | 5        | Chandler Bing   | Erite st    | Chicago     | IL    | 60666 | Visa     | 413313133318 | 10/22           | Chandler Bing   |
      | FamilyAlbum | 9        | Dr DrakeRamoray | Dale st     | Arl Hgths   | IL    | 60452 | Visa     | 533313133314 | 10/22           | Dr DrakeRamoray |
      | ScreenSaver | 10       | Monica Geller   | Euclid ave  | Arl Hgths   | IL    | 60312 | Visa     | 733313133313 | 10/22           | Monica Geller   |
      | MyMoney     | 3        | Ross Geller     | River rd    | Des Plaines | IL    | 60666 | Visa     | 833313133312 | 10/22           | Ross Geller     |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60312 | Visa     | 933313133311 | 12/22           | Ken Adams       |

