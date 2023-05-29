package example.micronaut.entities;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity
public record InsuranceType(
	@Id
	Integer id,
	String name
) {
}
