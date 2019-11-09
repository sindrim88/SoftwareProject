package is.hi.hbv503.FitnessTracker.FitnessTracker.Services;

import is.hi.hbv503.FitnessTracker.FitnessTracker.Entities.User;

import java.util.List;

public interface UserService {
    User save(User user);
    void delete(User user);
    List<User> findAll();
    User findByUsername(String Username);
    User login(User user);
}
