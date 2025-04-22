Feature: Validate correct integration and processing of OCR and METIQ

  Scenario: Validate integration and processing by uploading documents
    Given I am on the document upload page
    When I upload structured and unstructured documents
    Then the system processes the documents with OCR
    And extracts the data
    And displays the information for confirmation