package example.micronaut.entities;

import io.micronaut.data.annotation.EmbeddedId;
import io.micronaut.data.annotation.MappedEntity;

import java.math.BigDecimal;

@MappedEntity
public record Salary(
		@EmbeddedId
		SalaryId id,
		BigDecimal percentage
) {
}
