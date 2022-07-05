package com.version1.BootIntro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootIntroApplication implements CommandLineRunner {
	@Autowired
	private Owner owner;

	public static void main(String[] args) {
		SpringApplication.run(BootIntroApplication.class, args);
	}

	public void run(String...arg0) throws Exception{
		System.out.println(owner.getPetName());
	}
}
