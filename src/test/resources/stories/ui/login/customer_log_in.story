Narrative:
As a Cutsomer
I want to login into the application

Scenario: Login into the banking software
Meta:
@tag component:UI
@tag tool:jbehave

Given I am on application landing page
When I log in as customer: '<userName>'
Then I want to see my bank account
Examples:
|userName|
|Hermoine Granger|
|Harry Potter|

Scenario: Login is possible only for valid users
Meta:
@tag component:UI
@tag tool:jbehave

Given I am on customer login page
When I select a valid customer name from the list
Then the 'Login' button is displayed
When I select the '---Your Name---' option
Then the 'Login' button is not displayed