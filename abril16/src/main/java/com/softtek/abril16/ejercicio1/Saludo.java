package com.softtek.abril16.ejercicio1;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class Saludo implements ISaludo {
@Value("Hola que tal")
    private String varsal;



    public String saludarfun(){

        return varsal;

    }

    public String getVarsal() {
        return varsal;
    }

    public void setVarsal(String varsal) {
        this.varsal = varsal;
    }
}
