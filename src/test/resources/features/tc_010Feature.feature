Feature: Generación y almacenamiento de Slip de salida

  Scenario: Validar generación de 'Slip de salida' y almacenamiento en historial
    Given el usuario ha cargado y procesado los documentos
    When el sistema procesa la solicitud
    Then se genera el 'Slip de salida'
    And los documentos originales se guardan en el historial
    And los datos extraídos se almacenan correctamente en el historial de la solicitud