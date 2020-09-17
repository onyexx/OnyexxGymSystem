package za.co.MyGymSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.MyGymSystem.entities.Personalinformation;

@Repository
public interface PersonalinformationRepository extends JpaRepository<Personalinformation, Integer> {
	
	List<Personalinformation> findAll();
	
	Personalinformation findById(int id);
	
	Personalinformation deleteById(int id);

}
