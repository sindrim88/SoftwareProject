package is.hi.hbv503.FitnessTracker.FitnessTracker.Repositories;

import is.hi.hbv503.FitnessTracker.FitnessTracker.Entities.ExerciseLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseLogRepository extends JpaRepository<ExerciseLog, Long> {
    ExerciseLog save(ExerciseLog exerciceLog);
    void delete(ExerciseLog exerciceLog);
    List<ExerciseLog> findAll();

}
