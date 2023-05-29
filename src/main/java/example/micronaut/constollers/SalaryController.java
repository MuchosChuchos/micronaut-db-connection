package example.micronaut.constollers;

import example.micronaut.entities.Salary;
import example.micronaut.repositories.SalaryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {
	private final SalaryRepository salaryRepository;

	public SalaryController(SalaryRepository salaryRepository) {
		this.salaryRepository = salaryRepository;
	}

	@PostMapping("/salary")
	public Salary createSalary(Salary salary) {
		return salaryRepository.save(salary);
	}

	@GetMapping("/salaries")
	public Iterable<Salary> getAll() {
		return salaryRepository.findAll();
	}

}

