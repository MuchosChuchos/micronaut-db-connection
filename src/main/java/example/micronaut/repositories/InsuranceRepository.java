package example.micronaut.repositories;

import example.micronaut.entities.Insurance;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.MYSQL)
//@JdbcRepository(dialect = Dialect.POSTGRES)
public interface InsuranceRepository extends CrudRepository<Insurance, Integer> {
}
