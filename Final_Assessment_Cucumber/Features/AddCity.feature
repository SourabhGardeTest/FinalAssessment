Feature: Add City
Scenario: Add City
Given Open chrome browser
When User Opens the URL "https://products.pisystindia.com/Ecommerce/admin"
And Enters Email as "admin@gmail.com" and Password as "123456"
And Clicks On Login
When User Clicks Location
When User Clicks City
When User Clicks Add City
And Enters City as "NewPune"
And Clicks on Add
And Close Browser
