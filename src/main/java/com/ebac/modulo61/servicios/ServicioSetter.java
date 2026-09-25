package com.ebac.modulo61.servicios;

import com.ebac.modulo61.model.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioSetter {

    private DataBase dataBase;

    @Autowired
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void ejecutar() {
        System.out.println("Inyeccion por Setter: " + dataBase.obtenerDatos());
    }
}
