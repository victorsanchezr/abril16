package com.softtek.abril16;

import com.softtek.abril16.ejercicio1.ISaludo;
import com.softtek.abril16.ejercicio2.Conductor;
import com.softtek.abril16.ejercicio3.Coche1;
import com.softtek.abril16.ejercicio3.SeguroCoche;
import com.softtek.abril16.ejercicio4.Secretario;
import com.softtek.abril16.ejercicio5.Cliente2;
import com.softtek.abril16.ejercicio5.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {


	@Autowired
	private ISaludo saludo;
	@Autowired
	private Conductor c1;
	@Autowired
	private SeguroCoche sg;
	@Autowired
	private Coche1 ch;

	@Autowired
	private Cliente2 cl2;

	@Autowired
	private IDAO id;

	@Autowired
	private Secretario se;

	public static void main(String[] args) {
		SpringApplication.run(Abril16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludo.saludarfun());
		System.out.println(c1.conducir());

		System.out.println(sg.reparar(ch));

		System.out.println(se.getInforme());

		System.out.println(id.insertar(cl2));

	}
}
