package local.playground.redis.repository;

import local.playground.redis.model.JobSummaryCounter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface RedisExampleRepository extends CrudRepository<JobSummaryCounter, LocalDate> {

}
