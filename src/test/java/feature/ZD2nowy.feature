Feature: Shopping Test ZD2
  
  Scenario: Buy Hummingbird Sweater in M size.
    Given Registered User  is on https://mystore-testlab.coderslab.pl website
    When User log in into shop by Sign In tile and put test data into dedicated bars [email: koza@koza.pl pass: kozaa]
    And  User choose HummingBird Printed Sweater
    And User choose size M
    And User choose 5 pcs
    Then User put articles into cart
    And User go to checkout
    And User confirm address
    Then User choose shipping method "pick up in-store"
    And User choose payment "Pay by Check"
    And User click on "order with an obligation to pay"
    And User make PrtSc with order confirmation with the amount.
