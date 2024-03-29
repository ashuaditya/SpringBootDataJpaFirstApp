package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	public void run(String... args) throws Exception {
		
		System.out.println(repo.getClass().getName());
		Product p = repo.save(new Product("Ashu", 3.2));
		System.out.println(p);
		repo.save(new Product("Karn", 5.6));
		repo.save(new Product("Aditya", 6.7));
		System.out.println("Done");
	}

}
