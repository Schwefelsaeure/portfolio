class SimplePerceptionModel
  ...
  void update(List<Pedestrian> pedestrians, List<Stimulus> stimuli) {
    
    for (Pedestrian ped : pedestrians) {
      mostImportantStimulus = prioritizeStimuli(stimuli, ped);
      ped.setMostImportantStimulus(mostImportantStimulus);
    }
  }
}
