Feature: Test Mail Ru login page

  Scenario: Test positive login page
    Given I am on main application page
    When I login as correct user
    Then I see logout link
   
   Scenario Outline: Test negative login page
    Given I am on main application page
    When I login as user with "<name>" and "<password>"
    Then I see error message
    Examples: 
      | name   | password    |
      | Strim	| bla-bla-bla |
      | Torrero |  Fly-flu 	  |
   
   Scenario Outline: Test Weather in different cities of the world
   	Given I am on main application page
   	When I click on the weather
   	And I enter the "<city>"
   	And I click on the weather for 14 days
   	Then I see weather
   	Examples:
   		|city|
   		|Санкт-Петербург|
   		|Москва|
   		|Адлер|
   		
   