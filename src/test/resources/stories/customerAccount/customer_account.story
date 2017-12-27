Narrative:
As a Cutsomer
I want to manage my accounts by depositing or withdrawing money,
and reviewing my transaction history

Scenario: Data displayed on main page
Meta:
@tag component:UI
@tag tool:jbehave

Given I am logged in as a valid customer
When I open the main page
Then I can choose from my accounts
And the 'account number' is displayed
And the 'balance' is displayed
And the 'currency' is displayed
And I can access my 'transactions'
And I can start 'deposits'
And I can start 'withdrawls'

Scenario: Viewing all my accounts
Meta:
@tag component:UI
@tag tool:jbehave

!-- Given I am logged in as 'Hermoine Granger'
!-- When I select the '<bankAccount>'
!-- Then the '<accountNumber>' is displayed
!-- And the '<balance>' is displayed
!-- And the '<currency>' is displayed
Examples:
|bankAccount|accountNumber|balance|currency|
|1002       |1002         |0      |Pound   |
|1003       |1003         |0      |Rupee   |
|1001       |1001         |5096   |Dollar  |