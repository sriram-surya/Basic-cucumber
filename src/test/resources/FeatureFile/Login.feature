Feature: To validate the login functionality of Farfatch


Scenario: To validate the login page with all credentials

And User has to enter the value in username and password

|username                 |password      |mobile number |
|java@gamil.com           |surya         |java@gamil.com|
|java@gamil.com           |surya         |java@gamil.com|
|sriramsurya97@gamil.com  |surya12397    |java@gamil.com|
And user has to click the login button
Then incorrect login value sholud be shown in the screen

#Examples:
