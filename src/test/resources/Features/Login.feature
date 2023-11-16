Feature: Checking the login functionality of the sportsjam web application
Background:
 Given user is in the home page of sportsjam
And User clicks the log in button

  @ValidCredentials
 Scenario: User logins to the web application with valid credentials
    When User gives valid email
    And User gives valid password
    And  User clicks the login button
    Then User is shown looged in to the website

  @InValidCredentials
   Scenario: User logins to the web application with Invalid credentials
    When  User gives Invalid email
    And User gives Invalid password
    And User clicks the login button
    Then User is shown No customer account found message

  @ForgotPassword
  Scenario: User uses the forgot password feature to recover their password 
  When  User clicks the forrgot password button 
  And User gives valid emailid
  And the user clicks submit
  Then a pop is shown with a message sucessfully sent recovery email
