package example.micronaut.constollers;

import example.micronaut.entities.Agent;
import example.micronaut.repositories.AgentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {
	private final AgentRepository agentRepository;

	public AgentController(AgentRepository agentRepository) {
		this.agentRepository = agentRepository;
	}

	@PostMapping("/agent")
	public Agent createAgent(Agent agent) {
		return agentRepository.save(agent);
	}

	@GetMapping("/agents")
	public Iterable<Agent> getAll() {
		return agentRepository.findAll();
	}

}

