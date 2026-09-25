package com.ebac.modulo61.servicios;

import com.ebac.modulo61.figuras.Figura;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private final Figura figura;

    public Service(@Qualifier("circulo") Figura figura) {
        this.figura = figura;
    }

    public void ejecutar() {
        System.out.println("Service: " + figura.dibujar());
    }
}
