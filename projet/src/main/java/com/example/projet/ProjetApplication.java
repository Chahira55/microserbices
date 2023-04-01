package com.example.projet;

import com.example.projet.Model.Condidat;
import com.example.projet.Repository.CondidatRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplication.class, args);
	}

	@Bean
	ApplicationRunner start(CondidatRepository repo) {
		return args -> {
			Stream.of(
					new Condidat(1, "Chahira", "Maoua"),
					new Condidat(2, "Cha", "Mii")
			).forEach(condidat -> {
				repo.save(condidat);
			});
			repo.findAll().forEach(c -> System.out.println(c.getName() + " " + c.getLastName()));
		};
	}

}


