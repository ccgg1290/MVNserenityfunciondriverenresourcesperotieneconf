# language: es

Característica: Realizar compras de artículos
  Como un nuevo cliente
  Quiero ingresar a la página www.abc.com
  Para realizar una compra de un artículo



  @EscenarioYoutube
  Escenario: ingreso a you tube
    Dado que un nuevo cliente Arturo accede hasta la web de youtube
    Cuando el agrega 3 unidades al carro
    Entonces el ve los productos listado en el carro de compras

  @EscenarioGoogle @EscenarioGmail
  Escenario: ingreso a google
    Dado que un nuevo cliente accede hasta la web de google
    Cuando ingresa a google
    Entonces el ve los productos listado en el carro de compras


  @EscenarioGmail
  Escenario: ingreso a gmail
    Dado que un nuevo cliente accede hasta la web de gmail
    Cuando ingresa a gmail
    Entonces el ve los productos listado en el carro de compras
