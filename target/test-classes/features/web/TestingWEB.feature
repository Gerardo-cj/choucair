@web
Feature:  Ingresar a la opcion empleos en la pagina de Choucair

  @BuscarEmpleos
  Scenario: Ingresar a la opcion empleos de Choucair
    Given que el usuario accede a la web de choucair
    When click en la opcion Empleos
    And escribo la busqueda "Analista de Pruebas"
    And escribo la Ubicacion "Lima"
    Then click en la opcion Busqueda