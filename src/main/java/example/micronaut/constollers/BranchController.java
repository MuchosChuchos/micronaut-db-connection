package example.micronaut.constollers;

import example.micronaut.entities.Branch;
import example.micronaut.repositories.BranchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {
	private final BranchRepository branchRepository;

	public BranchController(BranchRepository branchRepository) {
		this.branchRepository = branchRepository;
	}

	@PostMapping("/branch")
	public Branch createBranch(Branch branch) {
		return branchRepository.save(branch);
	}

	@GetMapping("/branches")
	public Iterable<Branch> getAll() {
		return branchRepository.findAll();
	}

}
