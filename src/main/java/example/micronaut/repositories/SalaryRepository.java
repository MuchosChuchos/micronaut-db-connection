package example.micronaut.repositories;

import example.micronaut.entities.Salary;
import example.micronaut.entities.SalaryId;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.MYSQL)
//@JdbcRepository(dialect = Dialect.POSTGRES)
public interface SalaryRepository extends CrudRepository<Salary, SalaryId> {
}
