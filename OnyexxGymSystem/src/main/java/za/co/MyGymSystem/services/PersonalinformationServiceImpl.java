package za.co.MyGymSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.MyGymSystem.entities.Personalinformation;
import za.co.MyGymSystem.repositories.PersonalinformationRepository;

@Service
public class PersonalinformationServiceImpl implements PersonalinformationService{

	@Autowired
	private PersonalinformationRepository personalinformationRepository;
	
	@Override
	public Personalinformation createPersonalinformation(Personalinformation personalinformation) {
		
		return personalinformationRepository.save(personalinformation);
	}

	@Override
	public String updatePersonalinformation(Personalinformation personalinformation) {
		
		return null;
	}

	@Override
	public void deletePersonalinformation(int id) {
				
		personalinformationRepository.deleteById(id);
	}

	@Override
	public List<Personalinformation> fetchPersonalinformations() {
		
		return personalinformationRepository.findAll();
	}

	@Override
	public Personalinformation fetchPersonalinformation(int id) {
		
		return personalinformationRepository.findById(id);
	}

}
