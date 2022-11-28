package projeto.web.beytrabalho3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.web.beytrabalho3.model.Aula;
import projeto.web.beytrabalho3.repository.IAula;

@RestController
@RequestMapping("/aulas")
public class AulaController {
	@Autowired
	private IAula aulaDao;
	
	@GetMapping
	public List<Aula> listaAulas (){
		return (List<Aula>) aulaDao.findAll();
	}

	@PostMapping
	public Aula cadastraAula(@RequestBody Aula aula) {
		Aula novaAula = aulaDao.save(aula);
		return novaAula;
	}
	
	@PutMapping
	public Aula editarAula(@RequestBody Aula aula) {
		Aula novaAula = aulaDao.save(aula);
		return novaAula;
	}
	
	@DeleteMapping("/{id}")
	public Aula excluirAula (@PathVariable Integer id) {
		
	}
	
	
}
