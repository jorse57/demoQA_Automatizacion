#language: es
Característica:agregar registro y eliminar, seleccionar fechas

  Antecedentes:
    Dado Jorse esta en el portal web

  @AgregarRegistro
  Escenario: nuevo registro
    Cuando Jorse ingresa la informacion para el registro
    Entonces Jorse agregò un nuevo registro

  @AgregarFechas
  Escenario: nuevas fechas
    Cuando  ingresa nuevas fechas
    Entonces  agrega nuevas fechas

  @InteractuarVentanas
  Escenario: Interactuar con ventanas emergentes
    Cuando interactua con las ventanas emergentes
    Entonces valida sus acciones en la pagina