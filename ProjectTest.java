class ProjectTest {
  public static void main(String[] args) {
    Portfolio projects = new Portfolio();
    Project tri = new Project("Tri", "Is number one");
    projects.setProjects(tri);
    Project toad = new Project("Toad");
    projects.setProjects(toad);
    Project bin = new Project();
    projects.setProjects(bin);

    bin.setName("Bin");
    bin.setDescription("Is Tri's nickname");
    bin.setInitialCost((float) 99.99);
    tri.setInitialCost((float) 129.99);
    toad.setInitialCost((float) 159.99);

    // System.out.println(tri.elevatorPitch());
    // System.out.println(toad.elevatorPitch());
    // System.out.println(bin.elevatorPitch());

    System.out.println(projects.getPortfolioCost());
    projects.showPortfolio();
  }
}