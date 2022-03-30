while (simulationIsRunning) {
  ...
  if (usePsychologyLayer()) {
    perceptionModel.update(agents, stimuli);
    cognitionModel.update(agents);
  }
  
  locomotionModel.update(agents, time);
  time++;
}
