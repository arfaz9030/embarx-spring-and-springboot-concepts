package org.example.constructor.injection;

/*
 * Car is NOT responsible for creating CarSpecification.
 * It only declares what it needs.
 *
 * Interview line:
 * "In Spring, a class should declare its dependencies,
 * not create them using the new keyword."
 */
public class Car {

    /*
     * Car has a dependency on CarSpecification.
     * This represents a HAS-A relationship.
     *
     * Interview line:
     * "Dependencies are expressed as fields, not created internally."
     */
    private Specification specification;

    /*
     * Constructor Injection:
     * Spring will call this constructor and provide CarSpecification.
     *
     * Why constructor?
     * - Ensures Car is always created in a valid state
     * - Makes dependency mandatory
     *
     * Interview line:
     * "Constructor injection makes the dependency mandatory
     * and avoids partially initialized objects."
     */
    public Car(Specification specification) {
        this.specification = specification;
    }

    /*
     * Business method uses the injected dependency.
     * Car does not know HOW CarSpecification was created.
     *
     * Interview line:
     * "The class only uses the dependency, creation is handled by Spring."
     */
    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
