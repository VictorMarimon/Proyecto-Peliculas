# 🎥 Proyecto Películas

Este proyecto es una aplicación de gestión de películas desarrollada en **Java** utilizando el entorno de desarrollo **IntelliJ IDEA**. La aplicación permite a los usuarios organizar y administrar información relacionada con películas, ya sea a través de listas o archivos, ofreciendo una experiencia sencilla y funcional.

---

## 🚀 Características

- **Gestión de películas**:
  - Agregar nuevas películas.
  - Listar películas existentes.
  - Buscar películas por nombre.

- **Estructura modular**:
  - Separación clara en capas: dominio, servicio y presentación.
  - Persistencia de datos utilizando archivos.

---

## 🛠️ Tecnologías y herramientas

- **Lenguaje**: Java (versión compatible con el proyecto, ej. JDK 8+).
- **Entorno de desarrollo**: IntelliJ IDEA.
- **Control de versiones**: Git.

---

## 📂 Estructura del proyecto

│ ├── dominio/ │ └── Pelicula.java 

│ ├── servicio/ │ ├── IServicioPeliculas.java │ ├── ServicioPeliculasArchivos.java │ └── ServicioPeliculasLista.java 

│ └── presentacion/ └── CatalogoPeliculasApp.java 

---

## 🧑‍💻 Cómo ejecutar el proyecto

1. **Requisitos previos**:
   - Tener instalado [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (versión 8 o superior).
   - Instalar [IntelliJ IDEA](https://www.jetbrains.com/idea/).

2. **Pasos para la ejecución**:
   - Clona este repositorio:
     ```bash
     git clone https://github.com/tu-usuario/proyecto-peliculas.git
     ```
   - Abre el proyecto en IntelliJ IDEA.
   - Configura el SDK del proyecto (Java 8+).
   - Ejecuta el archivo `CatalogoPeliculasApp.java` desde la carpeta `presentacion`.

---

## 📝 Notas

- El proyecto incluye datos de prueba almacenados en un archivo `peliculas.txt` en la raíz.
- Para ampliar las funcionalidades, se pueden implementar otros tipos de persistencia o añadir una interfaz gráfica.

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si tienes ideas o mejoras, por favor:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`feature/nueva-funcionalidad`).
3. Envía un pull request.

---

## 📄 Licencia

Este proyecto se encuentra bajo la licencia **MIT**. Consulta el archivo `LICENSE` para más detalles.
