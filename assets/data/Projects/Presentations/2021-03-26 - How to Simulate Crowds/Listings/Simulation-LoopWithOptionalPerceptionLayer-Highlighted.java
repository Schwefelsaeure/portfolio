while (simulationIsRunning) {
  ...
  if (usePsychologyLayer()) {
    // Strategy pattern
    %{\color{red}
    perceptionModel.update(agents, stimuli);
    }%
    %{\color{red}
    cognitionModel.update(agents);
    }%
  }
  
  locomotionModel.update(agents, time);
  time++;
}
