package is.hi.hbv503.FitnessTracker.FitnessTracker.Services;

import is.hi.hbv503.FitnessTracker.FitnessTracker.Entities.ExerciseLog;

import java.util.List;

public interface ExerciseLogService {
    ExerciseLog save(ExerciseLog exerciseLog);
    void delete(ExerciseLog exerciseLog);
    List<ExerciseLog> findAll();
}
