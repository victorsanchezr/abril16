package com.softtek.abril16.ejercicio5;

import org.springframework.stereotype.Component;

@Component
public class ClienteDao implements IDAO{

    private IDAO conexion;

    @Override
    public String insertar(Cliente2 C1) {
        return "Cliente Insertado";
    }
}
