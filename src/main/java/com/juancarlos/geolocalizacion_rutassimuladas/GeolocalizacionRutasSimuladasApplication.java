package com.juancarlos.geolocalizacion_rutassimuladas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GeolocalizacionRutasSimuladasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeolocalizacionRutasSimuladasApplication.class, args);
    }

}
