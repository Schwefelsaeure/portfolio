public class CooperativeCognitionModel {
  ...
  for (Agent agent : agents) {
    boolean cannotMove = agent.getSpeed(lastSteps) <= threshold;
  
    if (cannotMove) {
        agent.setSelfCategory(COOPERATIVE);
    } else {
        agent.setSelfCategory(TARGET_ORIENTED);
    }
  }
    
}
