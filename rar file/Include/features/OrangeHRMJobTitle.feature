Feature: Title of your feature
  I want to use this template for my feature file


  Scenario Outline: Creating and Deleting Jobs
    Given I want to login and navigate to Job Titles 
    When I want to add Job Titles <title> and <description>
    Then I delete the jobs created
    And I want to exit

    Examples: 
      | title  | description | 
      | Atest | Atestdescp  |
      | Btest | Btestdescp  |
      | Ctest | Ctestdescp  |
