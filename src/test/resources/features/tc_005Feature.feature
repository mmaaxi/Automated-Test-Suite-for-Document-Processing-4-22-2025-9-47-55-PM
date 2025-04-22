Feature: Document upload validation

  Scenario: Validate required documents in upload process
    Given I start the document upload process
    When I attempt to proceed without a required document
    Then the system should prevent progression
    And an error message about the missing document should be shown