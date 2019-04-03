Feature: Test Mail Ru MailBox page

Scenario: Test Letter to Spam
    Given I am on main application page
    When I mark the letter
    And I send a letter to spam
    Then I see a letter in spam
    

Scenario: Test Letter from spam
	 
	 Given I am on main application page
	 When I mark the spam letter
	 And I click to inbox
	 Then I see a letter in inbox
	 
	Scenario: Mark three latters by Flag
	
    Given I am on main application page
    When I navigate to incoming folder
    When I mark latters by flag
    Then I see Latters are marked 
    
    Scenario: Remove all flags from letters
    
    Given I am on main application page
    When I navigate to incoming folder
    When I remove all flags from letters
    Then I see latters are unmarked
    
     Scenario Outline: Sent mail to the group of users
    Given I am an authorized user on the mail page
    When I sent mail to the group of users
    Then I see "<massage>" notification
    Examples:
    |massage|
    |Ваше письмо отправлено. Перейти во Входящие| 
	 
	 