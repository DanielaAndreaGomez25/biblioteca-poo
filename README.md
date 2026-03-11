Realizado por: Daniela Andrea Gomez Delgado y Juan José Muñoz Narváez
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


## Instrucciones para ejecutar el proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/DanielaAndreaGomez25/biblioteca-poo.git
```

2. Entrar al proyecto:

```bash
cd biblioteca-poo
```

3. Compilar el proyecto con Maven:

```bash
mvn compile
```

4. Ejecutar el programa:

```bash
mvn exec:java -Dexec.mainClass="com.biblioteca.Main"
```




## Digrama de Clases
<img width="223" height="341" alt="image" src="https://github.com/user-attachments/assets/58211d92-827d-43e9-9571-6029929821eb" />



## Situaciones donde no se puede aplicar herencia

1. **Clases declaradas como `final`**

Si una clase se declara como `final`, no puede ser heredada por otra clase.

```java
final class Libro {
}
```

En este caso no se podría hacer:

```java
class Novela extends Libro {
}
```

---

2. **Métodos con modificador `private`**

Los métodos privados no pueden ser heredados por las subclases.

```java
class Libro {
    private void mostrarDatos() {
    }
}
```

Una clase hija no podrá acceder a ese método.

---

## Nuevos atributos propuestos

Se pueden agregar los siguientes atributos al sistema de biblioteca:

- **ISBN : String** → identifica de forma única cada libro.
- **anioPublicacion : int** → indica el año en que fue publicado el libro.

---

## Método adicional propuesto

Se puede agregar un método para verificar si el libro está disponible para préstamo.

```java
public boolean disponible() {
    return ejemplares > prestados;
}
```

Este método permite saber si aún hay ejemplares disponibles para prestar.

Cambios realizados por el compañero

Actualización final del proyecto
