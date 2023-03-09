package com.example.der;

import com.example.der.controllers.SousoptionController;
import com.example.der.entities.Sousoption;
import com.example.der.services.SousoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class DerApplication implements CommandLineRunner {

	@Autowired
	private SousoptionService sousoptionService;

	@Autowired
	private SousoptionController sousoptionController;

	public static void main(String[] args) {
		SpringApplication.run(DerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//sousoptionController.addSousOption(new Sousoption(null,"myhjvdsvh"));
	//	System.out.println(" ===  avant ==");
			//System.out.println(" my=="+sousoptionController.getAllSousOption());
	}

}
