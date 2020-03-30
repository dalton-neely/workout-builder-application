package dalton.neely.triggerwriter.models;

public class Exercise {
  private String name;
  private Integer repetitions;
  private Integer rest;

  public Exercise(String name, Integer repetitions, Integer rest) {
    this.name = name;
    this.repetitions = repetitions;
    this.rest = rest;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getRepetitions() {
    return repetitions;
  }

  public void setRepetitions(Integer repetitions) {
    this.repetitions = repetitions;
  }

  public Integer getRest() {
    return rest;
  }

  public void setRest(Integer rest) {
    this.rest = rest;
  }

  public static class Builder {
    private final String name;
    private Integer repetitions;
    private Integer rest;

    public Builder(String name) {
      this.name = name;
    }

    public Builder repetitions(Integer repetitions) {
      this.repetitions = repetitions;
      return this;
    }

    public Builder rest(Integer rest) {
      this.rest = rest;
      return this;
    }

    public Exercise build() {
      return new Exercise(name, repetitions, rest);
    }
  }
}
