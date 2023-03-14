#language: es

Característica: Login

  Antecedentes:
    Dado que el usuario se encuentre en la pagina web

  @Exitoso
  Escenario: Logueo exitoso
    Cuando el ingrese usuario con la clave
      | Usuario | Clave    |
      | solv    | Beta.123 |
    Entonces el visualizara un mensaje de logueo


  @Fallido
  Esquema del escenario: logueo fallido
    Cuando el ingrese el usuario con la clave incorrectos
      | Usuario   | Clave   |
      | <usuario> | <clave> |
    Entonces el visualizara un mensaje de error

    Ejemplos:
      | usuario | clave    |
      | sols    | Beta.123 |
      | solv    | Beta.125 |








