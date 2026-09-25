package com.ebac.modulo61.model;

import org.springframework.stereotype.Repository;

@Repository
public class DataBase {

    public String conectar() {
        return "Conexion a la base de datos realizada correctamente";
    }

    public String obtenerDatos() {
        return "Datos obtenidos desde la base de datos";
    }
}
