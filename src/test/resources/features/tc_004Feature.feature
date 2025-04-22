Feature: Automatic extraction of compressed files
  As a user
  I want to upload a compressed file
  So that the system automatically extracts and lists each document

  Scenario: Validate automatic decompression of compressed files
    Given I am on the file upload page
    When I upload a compressed file "documents.zip"
    Then I should see a list of extracted documents