public class UpdateSchemeEventDriven implements UpdateSchemeOSM {
...
    void update(PedestrianOSM pedestrian, double timeStepInSec, double currentTimeInSec) {
        ...
        SelfCategory selfCategory = pedestrian.getSelfCategory();

        if (selfCategory == SelfCategory.TARGET_ORIENTED) {
            osmBehaviorController.makeStepToTarget(pedestrian, topography);
        } else if (selfCategory == SelfCategory.COOPERATIVE) {
            PedestrianOSM candidate = osmBehaviorController.findSwapCandidate(pedestrian, topography);

            if (candidate != null) {
                pedestrianEventsQueue.remove(candidate);
                osmBehaviorController.swapPedestrians(pedestrian, candidate, topography);
                pedestrianEventsQueue.add(candidate);
            } else {
                osmBehaviorController.makeStepToTarget(pedestrian, topography);
            }
        }
        ...
    }
}
