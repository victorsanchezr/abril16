package com.softtek.abril16.ejercicio4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InformeTrimestre1 implements IInforme{


    @Override
    public String getInforme() {
        return "Informe Principal";
    }
}
