Feature:Etsy search feature


  Scenario: Etsy default title verification
    Given user is on the Etsy landing page
    Then user should see Etsy title as expected

    #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @etsy
  Scenario: Etsy search title verifications
    Given user is on the Etsy landing page
    When user enters "wooden spoon"
    Then user should see "Wooden spoon" in the title

