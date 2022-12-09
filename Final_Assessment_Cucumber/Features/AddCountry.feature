Feature: Add Country
Scenario: Add Country
Given Open the chrome browser
When User Open the URL "https://xlogist.pisystindia.com/admin/login"
And Enter Email as "admin@gmail.com" and Password as "Charlie123"
And Click On Login
When User Click Location
When User Click Country
When User Click Add Country
And Enter Country as "Bharat"
And Click on Add
And Closes Browser
