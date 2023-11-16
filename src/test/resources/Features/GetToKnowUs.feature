Feature: Get to know us in SportsJam

Background:
  
  Given Launch URL to open SportsJam
  
 Scenario: User clicking About us

    When  User clicks About us
    Then Hello  Strikers message is shown
    
    Scenario:User clicking contact us
    When User clicks contact us
    Then Sportsjam.in Showrooms message is shown
    
     Scenario:User clicking inqury/feedback
      When User clicks inqury/feedback
    Then Sportsjam.in Showrooms message is shown
  
  Scenario:User clicking our stores
      When User clicks our stores
    Then Warehouse for online orders-Sukrt Retail Private Limited, message is shown
  
  Scenario:User clicking sportsjam team
      When User clicks sportsjam team
    Then WHO WE ARE @ SPORTSJAM.IN message is shown
  
  
