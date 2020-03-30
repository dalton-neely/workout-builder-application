package dalton.neely.triggerwriter.models;

import java.util.List;

public class WorkoutPlan {
  private String name;
  private List<Exercise> exercises;

  public WorkoutPlan(String name, List<Exercise> exercises) {
    this.name = name;
    this.exercises = exercises;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Exercise> getExercises() {
    return exercises;
  }

  public void setExercises(List<Exercise> exercises) {
    this.exercises = exercises;
  }

  public static class Builder {
    private final String name;
    private List<Exercise> exercises;

    public Builder(String name) {
      this.name = name;
    }

    public Builder exercises(List<Exercise> exercises) {
      this.exercises = exercises;
      return this;
    }

    public Builder exercise(Exercise exercise) {
      this.exercises.add(exercise);
      return this;
    }

    public WorkoutPlan build() {
      return new WorkoutPlan(name, exercises);
    }
  }
}
