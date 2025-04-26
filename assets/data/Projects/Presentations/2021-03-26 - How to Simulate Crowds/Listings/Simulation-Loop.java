while (simulationIsRunning) {
  ...
  // For each agent, search next agent
  // position that is closer to target
  locomotionModel.update(agents, time);
  ...
  time++;
}
