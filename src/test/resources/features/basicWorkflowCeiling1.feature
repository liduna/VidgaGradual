Feature:Creating solution for one layer curtains ceiling

  Scenario: I am able to create a solution for one layer of curtains
            with ceiling fitting

    Given I use "chrome" as a browser
    When  I navigate to a "https://ikea-aoa-dev.cybercomhosting.com/addon-app/windowsolutions/master/1.4.1-16-g07e5f8b/m2/"
    When  I confirm one layer curtains by click on next
    And   I confirm predefined width by a click on next
    And   I click on add cm
    And   I click on next in additional width
    And   I click ceiling
    Then  I am able to see items and price of my solution



