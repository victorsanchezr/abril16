package com.softtek.abril16.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeguroCoche {

    @Autowired
   private ITaller taller;

   //@Autowired
   private String aseguradora;


   public String reparar(Coche1 c){
       return taller.reparar(c);
   }

}
