package org.vadere.simulator.control.psychology.cognition.models;

/**
 * The {@link CooperativeCognitionModel} makes a pedestrian cooperative if its
 * average speed falls below a certain threshold. I.e., usually the agent
 * could not move for some time steps. For example, in case of other
 * counter-flowing agents.
 *
 * {@link SelfCategory#COOPERATIVE} should motivate pedestrians to swap places
 * instead of blindly walking to a target and colliding with other pedestrians.
 */
public class CooperativeCognitionModel implements ICognitionModel {

    private Topography topography;

    public void initialize(Topography topography) {
        this.topography = topography;
    }

    public void update(Collection<Pedestrian> pedestrians) {
        for (Pedestrian pedestrian : pedestrians) {
            if (pedestrianCannotMove(pedestrian)) {
                pedestrian.setSelfCategory(SelfCategory.COOPERATIVE);
            } else {
                pedestrian.setSelfCategory(SelfCategory.TARGET_ORIENTED);
            }
        }
    }

    private boolean pedestrianCannotMove(Pedestrian pedestrian) {
        boolean cannotMove = false;

        FootstepHistory footstepHistory = pedestrian.getFootstepHistory();
        int requiredFootSteps = 2;

        if (footstepHistory.size() >= requiredFootSteps
                && footstepHistory.getAverageSpeedInMeterPerSecond() <= 0.05) {
            cannotMove = true;
        }

        return cannotMove;
    }
}
