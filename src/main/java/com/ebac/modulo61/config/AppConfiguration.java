package com.ebac.modulo61.config;

import com.ebac.modulo61.figuras.Circulo;
import com.ebac.modulo61.figuras.Cuadrado;
import com.ebac.modulo61.figuras.Figura;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean("circulo")
    public Figura circulo() {
        return new Circulo();
    }

    @Bean("cuadrado")
    public Figura cuadrado() {
        return new Cuadrado();
    }
}
