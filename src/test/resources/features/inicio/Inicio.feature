# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Inicio

Característica: Inicio de sesion de usuario administrador
  Como usuario administrador ya registrado de la plataforma phptravels
  Quiero poder acceder exitosamente
  Para hacer uso de las funcionalidades relacionadas con la gestion de viajes

  # @HP               # Tipo de prueba [Happy Path | Altern Path]


  @HP
  @InicioExitoso
  Escenario: Validar inicio de sesion de un usuario administrador con credenciales
      Dado que Genny se encuentra registrada en phptravels para gestionar su cuenta
      Cuando intenta acceder con credenciales
      Entonces debería mostrarse en pantalla el tablero de gestion de viajes


  @AP
  @InicioFallido
  Escenario: Validar el inicio de sesion fallido de un usuario administrador con credenciales
    Dado que Genny se encuentra registrada en phptravels para gestionar su cuenta
    Cuando intenta acceder con credenciales no validas
    Entonces debería mostrarse en pantalla el mensaje de error correspondiente
