package projeto.web.beytrabalho3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.web.beytrabalho3.model.Aula;
import projeto.web.beytrabalho3.repository.AulaRepository;

@Service
public class AulaService {
	
	@Autowired
	public AulaRepository aulaRepository;

	public List<Aula> findAll() {
		return aulaRepository.findAll();
	}

	public Optional<Aula> findById(Integer id) {
		return aulaRepository.findById(id);
	}

	public Aula saveAula(Aula aula) {
		return aulaRepository.save(aula);
	}

	public Aula updateContact(int id, Aula aula) {
		Aula updatedAula = aulaRepository.findById(id).orElse(null);
		updatedAula.setCategoria(aula.getCategoria());
		updatedAula.setInstrutor(aula.getInstrutor());
		updatedAula.setData(aula.getData());
		updatedAula.setEhPratica(aula.isEhPratica());
		updatedAula.setEhTeorica(aula.isEhTeorica());
		return aulaRepository.save(updatedAula);
	}

	public void deleteById(int id) {
		aulaRepository.deleteById(id);
	}

}
