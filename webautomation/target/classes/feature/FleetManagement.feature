Feature: Verify Login and sign up module with SignUp for Doctor,Chemist and Student, verify login with OTP and Password, ForgotPassword,Resend OTP,changepassword functionality and Quicklinks verification, Homepage Nonloggedin user access.

  Background: 
    Given Validate the browser

Scenario Outline: Verify user is able to create group
     Given User must be logged in with Corporate Customer
    When User clicks Manage groups&users
    Then User clicks on create group icon
    When user enters the Group Name as <Group Name> Group Name
    When user enters the Description as <Description> Description
    Then User clicks on Next button
    Then User clicks on create group button
   # Then closes the browser

    Examples: 
      | Group Name | Description |
      |   8530906851 | Test@123 |
  
  
 