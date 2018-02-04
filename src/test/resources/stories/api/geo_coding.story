Narrative:
Based on https://alexromanov.github.io/2017/04/22/serenity-rest-assured/

Scenario: Get geocode for Amphitheatre Parkway
Given I have an address 1600 Amphitheatre Parkway, Mountain View, CA
When I request google api for geocode with address
Then I should get response status code 200
And I should get longitude -122.08427 and latitude 37.422348

Scenario: Get geocode for Winnetka
Given I have an address Winnetka
When I request google api for geocode with address
Then I should get response status code 200
And I should get longitude -87.735895 and latitude 42.10808340000001

Scenario: Get reversed geocode for Bedford Avenue
Given I have an longitude and latitude 40.714224,-73.961452
When I request google api for geocode with lontitude and latitude
Then I should get response status code 200
And I should get address 277 Bedford Ave, Brooklyn, NY 11211, USA