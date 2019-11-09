package is.hi.hbv503.FitnessTracker.FitnessTracker.Entities;

import javax.persistence.*;
import java.util.Date;


@Entity
public class ExerciseLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Exercise exercise;

    @ManyToOne
    private User user;

    public Date fromdate;
    public Date todate;

    public ExerciseLog() {
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getToDate() {
        return todate;
    }

    public void setToDate(Date todate) {
        this.todate = todate;
    }


    public ExerciseLog(Exercise exercise, User user, Date fromdate, Date todate) {
        this.exercise = exercise;
        this.user = user;
        this.fromdate = fromdate;
        this.todate = todate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}