package usjt.br.scb.controle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/livros")
public class LivroControle {
	@RequestMapping(method=RequestMethod.GET)
	public String listaDeLivros() {
		return "chamado do metodo lista de livros";
	}

}
