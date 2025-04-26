public void update(List<Agent> agents, double time) {

  for (Agent agent : agents) {
      updateAgent(agent, time)
  }
  
}

void updateAgent(Agent agent, double time) {

  selfCategory = agent.getSelfCategory();
  
  if (selfCategory == TARGET_ORIENTED) {
      makeStepToTarget(agent);
  } else if (selfCategory == COOPERATIVE) {
      // Search for other cooperative agents in a search radius r.
      Agent candidate = findSwapCandidate(agent);
  
      if (candidate != null) {
          swapPedestrians(agent, candidate);
      } else {
          makeStepToTarget(agent);
      }
  }
  ...
  
}
