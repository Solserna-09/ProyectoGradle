#language: es

Característica: registro

  Escenario: registro de usuario exitoso
    Dado que el usuario se encuentre en la pagina web
    Cuando el complete la informacion de registro
      | Nombre   | Apellido | Telefono | Correo           | Direccion     | Ciudad   | Estado    | CodigoPostal | Usuario     | Clave    | ConfirmacionClave |
      | Patricia | Archiboa | 4567894  | moni45@gmail.com | cra 50b 15-30 | Medellin | Antioquia | 003          | Patri.archi | patri347 | patri347          |
    Entonces el visualizara un mensaje de registro de exitoso







