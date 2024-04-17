package com.softtek.abril16.ejercicio3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Coche1 c) {
        return "Chapa reprada";
    }
}
