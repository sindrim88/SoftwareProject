package is.hi.hbv503.FitnessTracker.FitnessTracker.Services.Implementations;

import is.hi.hbv503.FitnessTracker.FitnessTracker.Entities.Exercise;
import is.hi.hbv503.FitnessTracker.FitnessTracker.Entities.ExerciseLog;
import is.hi.hbv503.FitnessTracker.FitnessTracker.Repositories.ExerciseLogRepository;
import is.hi.hbv503.FitnessTracker.FitnessTracker.Services.ExerciseLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class ExerciseLogImplementation implements ExerciseLogService {
        ExerciseLogRepository repository;

        @Autowired
        public ExerciseLogImplementation(ExerciseLogRepository repository) {
            this.repository = repository;
        }

        @Override
        public ExerciseLog save(ExerciseLog exerciseLog) {
            return repository.save(exerciseLog);
        }

        @Override
        public void delete(ExerciseLog exerciseLog) {
            repository.delete(exerciseLog);
        }

        @Override
        public List<ExerciseLog> findAll() {
            return repository.findAll();
        }
    }

