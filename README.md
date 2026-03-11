# Sistema de Gestión de Biblioteca

Proyecto desarrollado en Java utilizando Maven que implementa un sistema de biblioteca aplicando los principios de Programación Orientada a Objetos (POO): abstracción, encapsulamiento y herencia.

## Clases del sistema

* Libro
* LibroTexto
* LibroTextoUNIAC
* Novela

## Funcionalidades

* Registrar libros
* Realizar préstamo de libros
* Realizar devolución de libros
* Mostrar información de los libros


## Digrama de Clases 

@startuml

class Libro {
  - titulo : String
  - autor : String
  - ejemplares : int
  - prestados : int
  + prestamo() : boolean
  + devolucion() : boolean
  + toString() : String
}

class LibroTexto {
  - curso : String
}

class LibroTextoUNIAC {
  - facultad : String
}

class Novela {
  - tipo : String
}

Libro <|-- LibroTexto
LibroTexto <|-- LibroTextoUNIAC
Libro <|-- Novela

@enduml
