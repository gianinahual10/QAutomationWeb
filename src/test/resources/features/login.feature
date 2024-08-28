#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, ingresar a la pagina
  Para realizar una compra

  @test
  Escenario: Validacion de login exitoso
    Dado estoy en la página de la tienda MyStore
    Y me logueo con mi usuario: "gianinahual@gmail.com" y clave: "oxitoina2022"
    Cuando navego a la categoria: "Clothes" y subcategoria: "Men"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito


  @test2
  Escenario: valida iniciar sesión con usuario y clave inválidos
    Dado estoy en la página de la tienda MyStore
    Y me logueo con mi usuario "usuario_invalido" y clave "clave_invalida"
    Entonces valido que no debería aparecer el título con el nombre del usuario
    Y valido que debería mostrar un mensaje de error de autenticación

  @test3
  Escenario: validacion con categoría inexistente
    Dado estoy en la página de la tienda MyStore
    Y me logueo con mi usuario "usuario_valido" y clave "clave_valida"
    Cuando navego a la categoría: "Autos" y subcategoría: "De lujo"
    Entonces valido que no debería ver ningún producto
    Y valido que se muestra un mensaje de error