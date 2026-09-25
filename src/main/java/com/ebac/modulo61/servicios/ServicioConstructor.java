package com.ebac.modulo61.servicios;

import com.ebac.modulo61.model.DataBase;
import org.springframework.stereotype.Service;

@Service
public class ServicioConstructor {

    private final DataBase dataBase;

    public ServicioConstructor(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void ejecutar() {
        System.out.println("Inyeccion por Constructor: " + dataBase.obtenerDatos());
    }
}
