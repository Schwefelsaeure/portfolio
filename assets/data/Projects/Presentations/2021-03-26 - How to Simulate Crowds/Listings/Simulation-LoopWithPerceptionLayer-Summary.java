while (simulationIsRunning) {
  ...
  %{\color{PerceptionColor}
  // Perception
  }%
  perceptionModel.update(agents, stimuli);
  ...
  %{\color{CognitionColor}
  // Cognition
  }%  
  cognitionModel.update(agents);
  ...
  %{\color{LocomotionColor}
  // Locomotion
  }%
  locomotionModel.update(agents, time);
  ...
  time++;
}
