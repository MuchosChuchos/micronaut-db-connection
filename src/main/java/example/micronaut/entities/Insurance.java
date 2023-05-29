package example.micronaut.entities;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;

import java.math.BigDecimal;
import java.time.LocalDate;

@MappedEntity
public record Insurance(
		@Id
		Integer id,
		LocalDate date,
		BigDecimal insurancePrice,
		BigDecimal tarrif,
		@Relation(Relation.Kind.MANY_TO_ONE)
		Branch branch,
		@Relation(Relation.Kind.MANY_TO_ONE)
		InsuranceType insuranceType
) {
}
