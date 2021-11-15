#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@flightswitch
Feature: Flight ticket reservation
  I want to make a flight reservation using Main Page 

Background:
		Given I access ryanair home page
		And I submit my data for new search
		And submit search

  @id_001
  Scenario: Execute an date edit before flight order    
    When I change flight date for departure 2022-06-25 return 2022-07-23
    And procceed with flights needed info
    Then I can procced to checkout payment page
