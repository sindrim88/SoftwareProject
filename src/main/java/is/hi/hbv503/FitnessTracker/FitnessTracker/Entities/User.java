package is.hi.hbv503.FitnessTracker.FitnessTracker.Entities;

import is.hi.hbv503.FitnessTracker.FitnessTracker.Services.ExerciseService;
import is.hi.hbv503.FitnessTracker.FitnessTracker.Services.UserService;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "USER")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public String username;
    public String password;

    @OneToMany(mappedBy = "user")
    private List<ExerciseLog> exercices = new ArrayList<>();

    public List<ExerciseLog> getExercices() {
        return exercices;
    }

    public void setExercices(List<ExerciseLog> exercices) {
        this.exercices = exercices;
    }

    @OneToMany(mappedBy = "user")
    private List<Exercise> userExercices = new ArrayList<>();

    public List<Exercise> getUserExercice() {
        return userExercices;
    }

    public void setUserExercices(List<Exercise> exercices) {
        this.userExercices = exercices;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return username;
    }

    public String getuName() {
        return username;
    }

    public void setuName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
        this.userExercices = new ArrayList<Exercise>();
    }

    public void addExercice(Exercise exercise) {
        userExercices.add(exercise);
    }

}
