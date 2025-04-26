public class SimpleCognitionModel implements ICognitionModel {
    ...
    public void update(Collection<Pedestrian> pedestrians) {
        for (Pedestrian pedestrian : pedestrians) {

            Stimulus stimulus = pedestrian.getMostImportantStimulus();
            SelfCategory nextSelfCategory;

            if (stimulus instanceof Threat) {
                nextSelfCategory = SelfCategory.THREATENED;
            } else if (stimulus instanceof ElapsedTime) {
                nextSelfCategory = SelfCategory.TARGET_ORIENTED;
            } else {
                throw new IllegalArgumentException(...);
            }

            pedestrian.setSelfCategory(nextSelfCategory);
        }
    }

}
