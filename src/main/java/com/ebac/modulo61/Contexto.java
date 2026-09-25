package com.ebac.modulo61;

import com.ebac.modulo61.figuras.Figura;
import com.ebac.modulo61.servicios.Service;
import com.ebac.modulo61.servicios.ServicioAnotacion;
import com.ebac.modulo61.servicios.ServicioConstructor;
import com.ebac.modulo61.servicios.ServicioSetter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Contexto implements CommandLineRunner {

    private final ServicioSetter servicioSetter;
    private final ServicioConstructor servicioConstructor;
    private final ServicioAnotacion servicioAnotacion;
    private final Service service;
    private final Figura cuadrado;

    public Contexto(
            ServicioSetter servicioSetter,
            ServicioConstructor servicioConstructor,
            ServicioAnotacion servicioAnotacion,
            Service service,
            @Qualifier("cuadrado") Figura cuadrado) {

        this.servicioSetter = servicioSetter;
        this.servicioConstructor = servicioConstructor;
        this.servicioAnotacion = servicioAnotacion;
        this.service = service;
        this.cuadrado = cuadrado;
    }

    @Override
    public void run(String... args) {
        System.out.println("===== MODULO 61 - SPRING =====");

        servicioSetter.ejecutar();
        servicioConstructor.ejecutar();
        servicioAnotacion.ejecutar();

        service.ejecutar();

        System.out.println("Figura adicional: " + cuadrado.dibujar());
    }
}
