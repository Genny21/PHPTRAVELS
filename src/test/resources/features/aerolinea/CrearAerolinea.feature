# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Aerolinea

Característica: Crear una nueva aerolinea
  Como usuario administrador en sesión activa en la plataforma phptravels
  Quiero poder crear una nueva aerolinea
  Para hacer uso de las funcionalidades relacionadas con la gestion de vuelos

  # @HP               # Tipo de prueba [Happy Path | Altern Path]


  @HP
  @CrearAerolinea
  Escenario: Validar la creacion de una nueva aerolinea
    Dado que Genny ha ingresado exitosamente a phptravels
    Cuando realiza la creacion de una nueva aerolinea con toda la informacion
    Entonces deberia presentarse la aerolinea creada
