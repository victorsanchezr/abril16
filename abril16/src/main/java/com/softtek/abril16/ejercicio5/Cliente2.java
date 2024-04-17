package com.softtek.abril16.ejercicio5;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente2 {

    private String nombre;

    private String NIF;

}
