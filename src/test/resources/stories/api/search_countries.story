Narrative:
As a Cutsomer
I want to search for countries using ISO codes,
and retrieve the country names in english

Scenario: Search for several countries using ISO code
Meta:
@tag component:API
@tag tool:jbehave

When I search with ISO code '<isoCode>'
Then I get a success response with HTTP code '<httpCode>'
And the country name is '<countryName>'
Examples:
|isoCode|httpCode|countryName|
|US     |200     |United States of America|
|IN     |200     |India                   |
|BR     |200     |Brazil                  |
