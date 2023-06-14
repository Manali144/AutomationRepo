Feature: Verify Login and sign up module with SignUp for Doctor,Chemist and Student, verify login with OTP and Password, ForgotPassword,Resend OTP,changepassword functionality and Quicklinks verification, Homepage Nonloggedin user access.

  Background: 
    Given Validate the browser


Scenario Outline: Verify Login with Password functionality
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    Then closes the browser

    Examples: 
      | mobilenumber | Password |
      |   8530906851 | Test@123 |
  

  Scenario Outline: Verify login with otp functionality
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Given User should be able to enter the number<MobileNumber> mobile number
    Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Then User should be able to click on proceed button
    When User should be able to verify Buy Medicine menu
    Then closes the browser

    Examples: 
      | MobileNumber | OtpOne | OtpTwo | OtpThree | OtpFour |
      |   8530906851 |      1 |      2 |        3 |       4 |
      
