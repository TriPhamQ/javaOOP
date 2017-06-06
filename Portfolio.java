import java.util.ArrayList;

class Portfolio {
  private ArrayList<Project> projects = new ArrayList<Project>();

  public Portfolio() {

  }

  public Portfolio(Project project) {
    this.projects.add(project);
  }

  public Portfolio(ArrayList<Project> projects) {
    for (Project project : projects) {
      this.projects.add(project);
    }
  }

  public ArrayList<Project> getProjects() {
    return this.projects;
  }

  public void setProjects(Project project) {
    try {
      this.projects.add(project);
    } catch (Exception e) {
      System.out.println("Something is not quite right!");
    }
  }

  public float getPortfolioCost() {
    float cost = (float) 0.00;

    for (Project project : this.projects) {
      cost += project.getInitialCost();
    }

    return cost;
  }

  public void showPortfolio() {
    float cost = getPortfolioCost();
    for (Project project : getProjects()) {
      System.out.println(project.elevatorPitch());
    }
    System.out.println(cost);
  }
}