public void update(List<Agent> agents) {

  int lastSteps = 4;
  double threshold = 0.05;
  
  for (Agent agent : agents) {
    boolean cannotMove = agent.getSpeed(lastSteps) <= threshold;
  
    if (cannotMove) {
        agent.setSelfCategory(COOPERATIVE);
    } else {
        agent.setSelfCategory(TARGET_ORIENTED);
    }
  }
    
}
