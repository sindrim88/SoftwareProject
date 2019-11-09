package is.hi.hbv503.FitnessTracker.FitnessTracker.Entities;

import javax.persistence.*;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Exercise exercise;

    @ManyToOne
    private User user;

    private String title;
    private String description;
    private Double duration;

    public Exercise(){
    }

    public Exercise(String title, String description, Double duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    public Exercise(Exercise exercise) {
    }

    public Exercise getUserExercise()
    {
        return exercise;
    }

    public void setUserExercise(Exercise exercise)
    {
        this.exercise = exercise;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}

