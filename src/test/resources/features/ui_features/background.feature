Feature: Background
  @background
  Scenario: Go to homepage

    Given user opens the URL medunna
    Then verify the page title contains "MEDUNNA"
    Then capture the screenshot
