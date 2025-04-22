Feature: Validate usability of file preview and delete functionality

  Scenario: Upload documents and observe preview, then delete a file
    Given the user is on the file upload page
    When the user uploads multiple documents
    Then the system displays the name, size, and type of each file
    When the user deletes one of the files using the delete option
    Then the file is correctly removed from the list before confirmation