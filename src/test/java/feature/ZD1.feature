Feature: New address on test account

  Scenario Outline: Log in as registred user and add new address
    Given Registered User  is on "https://mystore-testlab.coderslab.pl" website
    When Registered User clicks Sign In tile
    And Registered User put email and password
    And Loged User clicks Addresses tile
    And Loged User clicks on create new address tile
    And fills fields "<alias>", "<address>", "<postcode>", "<city>", "<country>", "<phone>"
    And Loged USer click on Save button
    Then verifies if added data is correct "<alias>", "<address>", "<postcode>", "<city>", "<country>", "<phone>"
    Then delete new adress
    And Validate deleting

    Examples:
      | alias | address     | city      | postcode | country        | phone       |
      | Jenot | Kozie Worki | Jenotkowo | 1234     | United Kingdom | 123-123-123 |