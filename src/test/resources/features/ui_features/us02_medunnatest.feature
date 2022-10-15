Feature: TC_001_Username_Test
Background: go to homepage
Given Open the URL "https://medunna.com
Then Verify the page title contains "MEDUNNA"
When Click on the sign in and account icon
And Click on Register Button
Then Verify "Registration" text

Scenario:Username_Contain_Test
When  Click on the "SSN box"
And Enter "SSN" number
And Click on the "First Name" box
And Enter First Name
And Click on the  "Last Name" box
And Enter Last Name
And Click on the "username" box and click  Enter
Then Verify "Your username is required."
When Enter any any chars on the username
Then Verify "Your username is required." is not displayed


Feature: TC_002_Username_Api_Test
  Scenario: Username_Uniuqe_Test





Feature: TC_003_Email_Id_Create_Test
  Scenario:Email_Id_Test

    When Click on the "SSN box"
And Enter "SSN" number
And Click on the "First Name" box
And Enter First Name
And Click on the  "Last Name" box
And Enter Last Name
And Click on the "username" box
And Enter username
And Click on te Email box
And Enter invalid any emails
Then Verify "This field is invalid"
When Enter valid any email
Then Verify "This field is invalid"is not displayed
When Clear Email box
Then Verify "Your email is required."
When Enter valid any email
Then Verify "Your email is required." is not displayed


Feature: TC_004_Email_Api_Test
  Scenario: Email_Validated_Test
