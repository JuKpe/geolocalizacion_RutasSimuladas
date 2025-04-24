package com.juancarlos.geolocalizacion_rutassimuladas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/ubicacion"); // canal para enviar datos al frontend (salida)
        config.setApplicationDestinationPrefixes("/app"); // canal por el que el frontend envíe mensajes (entrada)
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-ubicacion") // URL del WebSocket
                .setAllowedOriginPatterns("*") // permite cualquier origen
                .withSockJS(); // soporte para navegadores que no soportan WebSocket
    }
}

