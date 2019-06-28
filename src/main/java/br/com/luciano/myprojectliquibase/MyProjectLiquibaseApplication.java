package br.com.luciano.myprojectliquibase;

import br.com.luciano.myprojectliquibase.model.User;
import br.com.luciano.myprojectliquibase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectLiquibaseApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyProjectLiquibaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        Iterable<User> all = this.userRepository.findAll();

        this.userRepository.saveAll(all);
    }
}
