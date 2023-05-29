package example.micronaut.constollers;

import example.micronaut.entities.InsuranceType;
import example.micronaut.repositories.InsuranceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceTypeController {
	@Autowired
	private InsuranceTypeRepository insuranceTypeRepository;

	@PostMapping("/insurance-type")
	public InsuranceType createInsuranceType(InsuranceType insuranceType) {
		return insuranceTypeRepository.save(insuranceType);
	}

	@GetMapping("/insurance-types")
	public Iterable<InsuranceType> getAll() {
		return insuranceTypeRepository.findAll();
	}

}