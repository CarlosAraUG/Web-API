# Web-API


Modificaciones a las API para el manejo de libros
Excepción LibroException:

Se ha agregado una nueva excepción llamada LibroException para manejar situaciones donde el libro solicitado no existe. Esta excepción se lanzará en el método GET /libros/{id_libro} si el libro con el ID especificado no se encuentra en la base de datos.

Respuesta de error personalizada:

En caso de que se lance la excepción LibroException, la API devolverá un código de estado HTTP NOT_FOUND junto con un mensaje de error personalizado que indica que el libro no existe.

Respuesta de creación exitosa:

Al crear un nuevo libro, la API devolverá un código de estado HTTP CREATED junto con un mensaje que confirma la creación del libro.

Manejo de errores y respuestas de la API
Las API de libros ahora implementan un mejor manejo de errores y respuestas más informativas.

Excepción LibroException:

Se lanza cuando se intenta obtener un libro que no existe.
Devuelve un código de estado HTTP NOT_FOUND con un mensaje de error personalizado que indica que el libro no existe.
Creación de libros:

Devuelve un código de estado HTTP CREATED junto con un mensaje que confirma la creación del libro.

{
  "error": "Libro no encontrado",
  "mensaje": "No se encontró ningún libro con el ID proporcionado."
}


respuesta de creación exitosa:

{
  "mensaje": "Libro creado exitosamente"
}
