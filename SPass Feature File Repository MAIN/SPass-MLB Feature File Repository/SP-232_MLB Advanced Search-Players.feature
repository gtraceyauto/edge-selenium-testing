Feature: SP-232_MLB Advanced Search- Players


 Scenario: Remove all references to 1032 IDs from MLB Advanced Searches- Players
    Given Start Statspass application and login
    And the MLB module is open
    When advanced search window is opened
    And Player statistics can be selected
    And Player splits can be selected
    And Player participant types can be selected
    And All time spans can be selected
    And Custom filters can be selected
    Then the correct players displayed when link is clicked