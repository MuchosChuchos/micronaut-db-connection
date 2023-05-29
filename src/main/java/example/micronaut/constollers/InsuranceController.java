package example.micronaut.constollers;

import example.micronaut.entities.Insurance;
import example.micronaut.repositories.InsuranceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {
	private final InsuranceRepository insuranceRepository;

	public InsuranceController(InsuranceRepository insuranceRepository) {
		this.insuranceRepository = insuranceRepository;
	}

	@PostMapping("/insurance")
	public Insurance createInsurance(Insurance insurance) {
		return insuranceRepository.save(insurance);
	}

	@GetMapping("/insurances")
	public Iterable<Insurance> getAll() {
		return insuranceRepository.findAll();
	}

}

