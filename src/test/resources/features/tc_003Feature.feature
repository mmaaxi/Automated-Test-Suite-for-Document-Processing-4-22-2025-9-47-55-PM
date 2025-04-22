Feature: Validate Unpermitted File Format or Exceeded File Size

  Scenario: Upload file with unpermitted format or size exceeded
    Given I am on the file upload page
    When I attempt to upload a file with an unpermitted format or size greater than 50 MB
    Then I should see an error message indicating invalid format or exceeded size