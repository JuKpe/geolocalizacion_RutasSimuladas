package com.juancarlos.geolocalizacion_rutassimuladas.controller;

import com.juancarlos.geolocalizacion_rutassimuladas.component.SimuladorRuta;
import com.juancarlos.geolocalizacion_rutassimuladas.model.Ubicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimuladorController {

    @Autowired
    private SimuladorRuta simulador;

    @PostMapping("/simulador/iniciar")
    public void iniciarSimulacion() {
        simulador.iniciar();
    }

    @PostMapping("/simulador/detener")
    public void detenerSimulacion() {
        simulador.detener();
    }


/*    @Autowired
    private SimpMessagingTemplate messagingTemplate;*/

/*    @PostMapping("/enviar")
    public void enviarDesdePostman(@RequestBody Ubicacion ubicacion) {
        messagingTemplate.convertAndSend("/ubicacion/actual", ubicacion);
    }*/
}

