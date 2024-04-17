package com.softtek.abril16.ejercicio4;

import org.springframework.stereotype.Component;

@Component
public class InformeTrimestre2 implements IInforme {
    @Override
    public String getInforme() {
        return "Informe secundario";
    }
}
