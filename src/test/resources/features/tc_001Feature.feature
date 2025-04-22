Feature: Validate document upload mode selection

  Scenario: User selects a document upload mode
    Given the user has navigated to the document upload page
    When the user selects the 'cargar documentos' option
    Then the system displays options for single and multiple uploads

    When the user chooses 'carga en un solo archivo'
    Then the system enables a single box for file upload

    When the user chooses 'cargar documentos por separado'
    Then the system displays multiple boxes for each required document