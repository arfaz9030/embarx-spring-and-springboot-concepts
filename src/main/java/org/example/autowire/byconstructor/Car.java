package org.example.autowire.byconstructor;

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
    private CarSpecification specification;

    public Car(CarSpecification specification) {
        this.specification = specification;
    }
//no need to write setter for constructor invoking
//    public void setSpecification(CarSpecification specification) {
//        this.specification = specification;
//    }

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
