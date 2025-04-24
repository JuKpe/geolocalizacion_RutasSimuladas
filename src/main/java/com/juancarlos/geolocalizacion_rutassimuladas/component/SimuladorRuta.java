package com.juancarlos.geolocalizacion_rutassimuladas.component;

import com.juancarlos.geolocalizacion_rutassimuladas.model.Ubicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@EnableScheduling
public class SimuladorRuta {

    private final SimpMessagingTemplate messagingTemplate;
    private final List<double[]> ruta;
    private int indice = 0;
    private boolean activo = false;

    @Autowired
    public SimuladorRuta(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;

        ruta = List.of(
                new double[]{-12.0464, -77.0428},
                new double[]{-12.0460, -77.0432},
                new double[]{-12.0455, -77.0438},
                new double[]{-12.0450, -77.0445},
                new double[]{-12.0445, -77.0452}
        );
    }

    @Scheduled(fixedRate = 1000)
    public void enviarUbicacionSimulada() {
        if (activo && indice < ruta.size()) {
            double[] coord = ruta.get(indice++);
            Ubicacion ubicacion = new Ubicacion();
            ubicacion.setLatitud(coord[0]);
            ubicacion.setLongitud(coord[1]);
            messagingTemplate.convertAndSend("/ubicacion/actual", ubicacion);
        }
    }

    public void iniciar() {
        indice = 0;
        activo = true;
    }

    public void detener() {
        activo = false;
    }

}

