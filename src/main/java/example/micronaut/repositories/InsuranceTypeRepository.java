package example.micronaut.repositories;

import example.micronaut.entities.InsuranceType;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.MYSQL)
//@JdbcRepository(dialect = Dialect.POSTGRES)
public interface InsuranceTypeRepository extends CrudRepository<InsuranceType, Integer> {
}

