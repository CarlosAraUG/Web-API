# Web-API

**Mejorando la experiencia del usuario con las API de libros:**

Nos complace anunciar importantes mejoras en nuestras API de libros, diseñadas para ofrecer una experiencia de usuario más fluida y robusta. Estas modificaciones se centran en dos aspectos clave: el manejo de errores y las respuestas de la API.

**1. Manejo de errores optimizado:**

Hemos introducido la excepción LibroException para gestionar de forma eficaz las situaciones en las que el libro solicitado no existe. Esta excepción se activa específicamente en el método GET /libros/{id_libro} cuando el libro con el ID especificado no se encuentra en la base de datos.

En caso de que se lance la excepción LibroException, la API devolverá un código de estado HTTP NOT_FOUND junto con un mensaje de error personalizado que claramente indica que el libro no existe. De este modo, los desarrolladores que consumen la API pueden identificar fácilmente este error y tomar las medidas oportunas.

**2. Respuestas de la API más informativas:**

Al crear un nuevo libro, la API ahora responde con un código de estado HTTP CREATED y un mensaje que confirma la creación del libro. Esta respuesta más detallada proporciona a los desarrolladores una confirmación clara del éxito de la operación.

**- Beneficios de las mejoras:**

**- Experiencia de usuario mejorada:** La gestión optimizada de errores y las respuestas más informativas de la API contribuyen a una experiencia de usuario más fluida y sencilla. Los desarrolladores pueden comprender mejor los resultados y reaccionar ante ellos de manera adecuada.

**- Mayor confiabilidad:** La nueva excepción LibroException permite a los desarrolladores manejar de forma robusta los escenarios en los que el libro solicitado no existe, lo que se traduce en una aplicación más confiable y estable.

**- Comunicación más clara:** Las respuestas de la API más detalladas brindan información más precisa sobre el estado de las operaciones, facilitando la comprensión y la integración con la API.

**Respuesta de error:**

{

  "error": "Libro no encontrado",
  
  "mensaje": "No se ha encontrado ningún libro con el ID especificado."
  
}


**Respuesta de creación exitosa:**

{

  "mensaje": "Libro creado exitosamente"
  
}
