package com.carlosdourado.libraryapi;

import com.carlosdourado.libraryapi.model.Autor;
import com.carlosdourado.libraryapi.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		var context = SpringApplication.run(Application.class, args);
		AutorRepository repository = context.getBean(AutorRepository.class);

		exemploSalvarResgistro(repository);
	}

	public static void exemploSalvarResgistro(AutorRepository autorRepository){
		Autor autor = new Autor();
		autor.setNome("Machado De Assim");
		autor.setNacionalidade("Brasileira");
		autor.setDataNascimento(LocalDate.of(1985, 6, 21));

		var autorSalvo = autorRepository.save(autor);
		System.out.println("Autor salvo: " + autorSalvo);

	}

}
