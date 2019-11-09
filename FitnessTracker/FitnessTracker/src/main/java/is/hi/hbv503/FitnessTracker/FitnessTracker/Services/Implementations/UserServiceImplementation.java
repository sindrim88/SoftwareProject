package is.hi.hbv503.FitnessTracker.FitnessTracker.Services.Implementations;

import is.hi.hbv503.FitnessTracker.FitnessTracker.Entities.User;
import is.hi.hbv503.FitnessTracker.FitnessTracker.Repositories.UserRepository;
import is.hi.hbv503.FitnessTracker.FitnessTracker.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    UserRepository repository;

    @Autowired
    public UserServiceImplementation(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public User login(User user) {
        User exists = repository.findByUsername(user.username);
        if(exists != null){
            if(exists.password.equals(user.password)){
                return user;
            }
        }
        return null;
    }

}