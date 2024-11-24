Feature: Search various categories should be possible align with product search

Scenario: User should be able to search product under product category

Given I Visit the Website as a guest user
When I enter product in search bar
And I search the product
Then user should be able to see product 

