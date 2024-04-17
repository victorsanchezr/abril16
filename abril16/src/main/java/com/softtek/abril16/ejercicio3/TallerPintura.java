package com.softtek.abril16.ejercicio3;

import org.springframework.stereotype.Component;

@Component
public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche1 c) {
        return "Coche pintado";
    }
}
