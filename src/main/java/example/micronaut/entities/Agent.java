package example.micronaut.entities;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;

@MappedEntity
public record Agent(
		@Id
		Integer id,
		String surname,
		String name,
		String middleName,
		String address,
		String phone,
		@Relation(Relation.Kind.MANY_TO_ONE)
		Branch branch
) {
}
