
Feature: Brinca website

  @brinca
  Scenario: Header Content
    Given I am on brinca Website
    When I check header content
    Then I can see header content

  @pending
  Scenario: Body Content
    Given I am on brinca Website
    When I check body content 
    Then I can see body content


  @pending
  Scenario: Footer Content
    Given I am on brinca Website
    When I check footer content 
    Then I can see footer content


  @pending
  Scenario: Logo HomePage
    Given I am on brinca Website
    When I click on brinca logo 
    Then I can see homepage


  @pending
  Scenario: Associe_Se Content
    Given I am on brinca Website
    When I check associe_se
    Then I can see associe_se content

  @pending
  Scenario: Vantagens Content
    Given I am on brinca Website
    When I check vantagens
    Then I can see vantagens content


  @pending
  Scenario: Depoimentos Content
    Given I am on brinca Website
    When I check depoimentos
    Then I can see depoimentos content


  @pending
  Scenario: Parceiros Content
    Given I am on brinca Website
    When I check parceiros
    Then I can see parceiros content


  @pending
  Scenario: Associe se
    Given I am on associe se
    When I fill on fields 
    Then I can see a confirmation message

  @generate
  Scenario: Eventos Footer
    Given I am on brinca Website
    When I I click on associe_se_footer link
    Then I can see associe_se content


@generate
  Scenario: Vantagens Footer
    Given I am on brinca Website
    When I click on Vantagens_footer link
    Then I can see Vantagens Page


@generate
  Scenario: Contato Footer
    Given I am on brinca Website
    When I click on contato_footer link
    Then I can see Contato Page


@generate
  Scenario: Seja Voluntario Footer
    Given I am on brinca Website
    When I click on seja Voluntario_footer link
    Then I can see seja voluntario Page

