# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Aeropuerto

Característica: Crear un nuevo aeropuerto
  Como usuario administrador en sesión activa en la plataforma phptravels
  Quiero poder crear un nuevo aeropuerto
  Para hacer uso de las funcionalidades relacionadas con la gestion de vuelos

  # @HP               # Tipo de prueba [Happy Path | Altern Path]


  @HP
  @CrearAeropuerto
  Escenario: Validar la creacion de un nuevo aeropuerto
    Dado que Genny ha ingresado exitosamente a phptravels
    Cuando realiza la creacion de un nuevo aeropuerto con toda la informacion
    Entonces deberia presentarse el aeropuerto creado


  @HP
  @DesistirCrearAeropuerto
  Escenario: Validar que se permita desistir de la creacion de un nuevo aeropuerto
    Dado que Genny ha ingresado exitosamente a phptravels
    Cuando desiste de la creacion de un nuevo aeropuerto
    Entonces no deberia presentarse ningun nuevo aeropuerto
