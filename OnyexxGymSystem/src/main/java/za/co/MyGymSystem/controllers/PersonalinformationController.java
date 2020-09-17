package za.co.MyGymSystem.controllers;

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

import za.co.MyGymSystem.entities.Personalinformation;
import za.co.MyGymSystem.services.PersonalinformationService;

@RestController
@RequestMapping("/api/v1/personalinformation-management/")
public class PersonalinformationController {
	
	@Autowired
	private PersonalinformationService personalinformationService;
	
	@GetMapping("personalinformations")
	public List<Personalinformation> fetchAllPersonalinformations() {
		
		return personalinformationService.fetchPersonalinformations();
	}
	
	@GetMapping("Personalinformation/{id}")
	public Personalinformation fetchById(@PathVariable(name = "id")int id) {
		
		return personalinformationService.fetchPersonalinformation(id);
		
	}
	
	@PostMapping("personalinformation")
	public Personalinformation creatPersonalinformation(@RequestBody Personalinformation personalinformation) {
		
		return personalinformationService.createPersonalinformation(personalinformation);
	}
	
	@PutMapping("personalinformation")
	public String updatPersonalinformation(Personalinformation personalinformation) {
		
		return personalinformationService.updatePersonalinformation(personalinformation);
	}

	@DeleteMapping("personalinformation/{id}")
	public void deletePersonalinformation(@PathVariable(name = "id")int id) {
		
		personalinformationService.deletePersonalinformation(id);
	}
}
