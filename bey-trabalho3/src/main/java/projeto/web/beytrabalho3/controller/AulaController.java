package projeto.web.beytrabalho3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import projeto.web.beytrabalho3.model.Aula;
import projeto.web.beytrabalho3.service.AulaService;

@Controller
public class AulaController {
	@Autowired
	private AulaService aulaService;

	@RequestMapping("/getaula")
	public String showReadAulatPage(Model model) {
		model.addAttribute("aula", aulaService.findAll());
		return "getaula";
	}

	@RequestMapping(value = "/createaula", method = RequestMethod.POST)
	public String createAula(@ModelAttribute("aula") Aula aula) {
		aulaService.saveAula(aula);
		return "createaula";
	}

	@RequestMapping(value = "/updateaula/{id}", method = RequestMethod.POST)
	public String updateAula(@PathVariable int id, @ModelAttribute("aula") Aula aula) {
		aulaService.updateContact(id, aula);
		return "updateaula";
	}

	@RequestMapping(value = "/deleteaula/{id}")
	public String deleteAula(@PathVariable int id) {
		aulaService.deleteById(id);
		return "deleteaula";
	}
}
