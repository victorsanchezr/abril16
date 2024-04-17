package com.softtek.abril16.ejercicio5;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AccesoDesarrollo implements IDAO {
    @Override
    public String insertar(Cliente2 C1) {
        return "Cliente insertado";
    }
}
