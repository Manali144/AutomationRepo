Feature: Verify Login and sign up module with SignUp for Doctor,Chemist and Student, verify login with OTP and Password, ForgotPassword,Resend OTP,changepassword functionality and Quicklinks verification, Homepage Nonloggedin user access.


Scenario Outline: Verify user is able to create group
 #  Given User must be logged in with Corporate Customer
   Then User clicks on Manage groups Module
    Then User clicks on create group icon
   When user enters the GroupName as <GroupName> Group name
    When user enters the Description as <Description> description
    Then User clicks on Next button
    Then user select Fleet Manager
    Then User clicks on Next button
    Then User select Fleet vehicle
    Then User click on CreateGroup button and verify success message
   # Then closes the browser

    Examples: 
      | GroupName | Description |
      |   TestG | TestAutomation |
      
      
  Scenario Outline: Verify user is able to create Drive
 #  Given User must be logged in with Corporate Customer
   Then User clicks on Manage groups Module
    Then User clicks on create group icon
   When user enters the GroupName as <GroupName> Group name
    When user enters the Description as <Description> description
    Then User clicks on Next button
    Then user select Fleet Manager
    Then User clicks on Next button
    Then User select Fleet vehicle
    Then User click on CreateGroup button and verify success message
   # Then closes the browser

    Examples: 
      | GroupName | Description |
      |   TestG | TestAutomation |
  
  
 