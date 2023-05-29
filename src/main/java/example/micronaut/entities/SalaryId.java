package example.micronaut.entities;

import io.micronaut.data.annotation.Embeddable;
import io.micronaut.data.annotation.Relation;

@Embeddable
public record SalaryId(
		@Relation(Relation.Kind.MANY_TO_ONE)
		Agent agent,
		@Relation(Relation.Kind.MANY_TO_ONE)
		Insurance insurance
) {
}
