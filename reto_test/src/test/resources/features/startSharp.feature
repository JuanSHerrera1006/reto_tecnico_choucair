#Author: JuanSHerrera

@testApp
Feature: startSharp
  As a user
  I want to be able to add new organizations
  So that I can add meetings for that organization

  Background:
    Given I am on StartSharp login page
    And I logged with specify Username as "admin" and Password as "serenity"

  @businessUnit
  Scenario: Create new organization
    Given I want to create a organization
    When I fill new business unit form
    Then I should give the Business Unit

  @meeting
  Scenario: Add new meeting to an organization
    Given I want to add a meeting
    When  I fill new meeting form
    Then I should give the pop up with the message "Save success"