package za.co.MyGymSystem.services;

import java.util.List;

import za.co.MyGymSystem.entities.Personalinformation;

public interface PersonalinformationService {
	
	Personalinformation createPersonalinformation(Personalinformation personalinformation);
	
	String updatePersonalinformation(Personalinformation personalinformation);
	
	void deletePersonalinformation(int id);
	
	List<Personalinformation> fetchPersonalinformations();
	
	Personalinformation fetchPersonalinformation(int id);

}
