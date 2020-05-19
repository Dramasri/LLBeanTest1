
@tag
Feature: To test the scenario for all Test Cases
  
  @Home&Goods
  Scenario: To move the element to Home and Goods
    Given Launch the webpage
    When Move the element to Home & Goods
    And Click on Bedding
    Then List of elements appeared & check it with assert
    
    
    @ReturnToTop
    Scenario: To scroll down and return to top
    Given Launch to the webpage
    When Scroll down the button
    Then Click on Return to top button 
    
    
    @Sale
    Scenario: To click on the sale of fifty percent
    
    Given Launch the webpage LLBean
    When Click on the sale button
    And Click the NarrowBy button & select the particular jeans
    Then List the products and check it with Assert
    
    @Smoke
    
    Scenario: To click the outdoor equipment
    
    Given Launching the webpage
    When Click on the outdoor equipment
    Then Check with the assert
    
    
    @Sanity
    
    Scenario: To click the login
    
    Given Check the login page
    When Click on the login button
    Then Check with the assert follows
    
    
    
 

    
    


  