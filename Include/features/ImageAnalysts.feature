Feature: Login as an Image Analysts

  Scenario Outline: Login with valid Image Analysts credentials
    Given User navigates to login page
    When User enters <username> and <password>
    Then User clicks on Login
    And Verify logged in User Home page is displaying
    
    Examples:
    |username	|password	|
    |Johnsmith	|cvW8qx4B2o3F4VwP/kNsqA==	|
