Feature: Validar rendimiento en la carga de archivos de diferentes tamaños

  Scenario: Subir archivos pequeños y medir tiempo de respuesta
    Given El usuario está en la página de carga de archivos
    When El usuario sube un archivo de 3 MB
    Then La carga y procesamiento se completan en tiempos inferiores a los especificados
    When El usuario sube un archivo de 6 MB
    Then La carga y procesamiento se completan en tiempos inferiores a los especificados
    When El usuario mide el tiempo de respuesta desde la selección hasta la vista previa
    Then El tiempo total se encuentra dentro de los límites establecidos