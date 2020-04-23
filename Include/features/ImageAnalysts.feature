Feature: Login as an Image Analysts

  Scenario Outline: Login with valid Image Analysts credentials
    Given User navigates to login page
    When User enters <username> and <password>
    Then User clicks on Login
    And Verify logged in User Home page is displaying
    Then User log outs from application

    Examples: 
      | username  | password                 |
      | Johnsmith | cvW8qx4B2o3F4VwP/kNsqA== |

  Scenario Outline: Login with valid Image Analysts credentials
    Given User navigates to login page
    When User enters <username> and <password>
    * User clicks on Login
    * Verify logged in User Home page is displaying
    Then navigate to operator screen
    When User simulate an image
    Then take accept decion on image
    Then User log outs from application
    

    Examples: 
      | username  | password                 |
      | Johnsmith | cvW8qx4B2o3F4VwP/kNsqA== |
