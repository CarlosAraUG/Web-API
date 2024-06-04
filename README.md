# Web-API


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
