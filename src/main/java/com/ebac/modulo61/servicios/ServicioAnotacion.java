package com.ebac.modulo61.servicios;

import com.ebac.modulo61.model.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAnotacion {

    @Autowired
    private DataBase dataBase;

    public void ejecutar() {
        System.out.println("Inyeccion por Anotacion: " + dataBase.obtenerDatos());
    }
}
