# 📍 Simulador de Geolocalización en Tiempo Real con Spring Boot, WebSocket y Leaflet

Este proyecto es una aplicación de simulación de geolocalización en tiempo real, desarrollada con **Spring Boot** y comunicación **WebSocket** (STOMP + SockJS). Permite enviar posiciones simuladas desde un backend y mostrarlas dinámicamente en un mapa interactivo utilizando **Leaflet.js** en el frontend.

---

## 🚀 Tecnologías Utilizadas

- 🟢 **Spring Boot 3**
- 🌐 **WebSocket (STOMP, SockJS)**
- 🗺️ **Leaflet.js**
- 📡 **Java 17**
- 🐳 **Docker**
- 📝 **Lombok**

---

## 🎯 Funcionalidades

- Comunicación en tiempo real mediante WebSockets.
- Visualización dinámica de ubicaciones en un mapa Leaflet.
- Simulación de rutas mediante envío de posiciones desde el backend.
- Control manual con botones: **Iniciar Simulación** y **Detener Simulación** .
- Dockerización completa para despliegue simple y portable.

# 📍 Mapa de Geolocalización

Así se ve la simulación en tiempo real:

### Ubicación inicial y final:
<p align="center">
  <img src="https://github.com/user-attachments/assets/29a4cb87-3bd5-4bfa-92c7-e56b2cd20729" width="400"/>
  <img src="https://github.com/user-attachments/assets/2ac1058f-b18d-41a2-a705-3d391acafc5f" width="375"/>
</p>

---

## 🗺️ Estructura del Proyecto

src\main\

      └── java\com\juancarlos\geolocalizacion_rutassimuladas│ 
      
          ├── controller/ │ 
          
          ├── config/ │ 
          
          ├── model/ │ 
          
          ├── component/ │
          
    └── resources\static |
    
          ├── mapa.html

## 📦 Cómo Compilar y Ejecutar

### 📌 Desde Maven (localmente)

<p align="center">
  ./mvnw clean package -DskipTests
  java -jar target/rutassimuladas-0.0.1-SNAPSHOT.jar
</p>

### 📌 Desde Docker
1️⃣ Construir imagen Docker:
<p align="center">
  docker build -t rutassimuladas .
</p>
2️⃣ Ejecutar contenedor:
<p align="center">
  docker run -p 8080:8080 rutassimuladas
</p>

3️⃣ Luego accede a:

http://localhost:8080/mapa.html 

🐳 Contenido del Dockerfile


