public void update(double currentTimeInSec) {
    ...
    SelfCategory selfCategory = getSelfCategory();
    VPoint position = getPosition();

    if (selfCategory == TARGET_ORIENTED) {
        // Use regular heuristics to move agent
        updateTargetDirection();
        nextPosition = navigation.getNavigationPosition();
        makeStep();
    } else if (selfCategory == EVADE) {
        // Evade tangentially or with sidestep
        INavigation evasionNavigation = new NavigationEvasion();
        evasionNavigation.initialize(this, topography, null);
        nextPosition = evasionNavigation.getNavigationPosition();
        makeStep();
    }
    ...
}
