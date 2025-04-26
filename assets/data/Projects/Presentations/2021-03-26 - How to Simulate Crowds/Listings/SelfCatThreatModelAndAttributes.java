public class SelfCatThreatModel
    implements Model {

    // Variables
    private AttributesSelfCatThreat
        attributesSelfCatThreat;
    ...
}

public class AttributesSelfCatThreat
    extends Attributes {

    AttributesOSM attributesLocomotion
        = new AttributesOSM();
    double probabilityInGroupMembership
        = 0.0;
    ...
}
