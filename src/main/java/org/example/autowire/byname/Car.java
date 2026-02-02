package org.example.autowire.byname;

/*
 * Car is NOT responsible for creating Specification.
 * It only declares what it needs.
 *
 * Interview line:
 * "In Spring, a class should declare its dependencies,
 * not create them using the new keyword."
 */
public class Car {

    /*
     * Car has a dependency on Specification.
     * This represents a HAS-A relationship.
     *
     * Interview line:
     * "Dependencies are expressed as fields, not created internally."
     */
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    /*
     * Business method uses the injected dependency.
     * Car does not know HOW Specification was created.
     *
     * Interview line:
     * "The class only uses the dependency, creation is handled by Spring."
     */
    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
