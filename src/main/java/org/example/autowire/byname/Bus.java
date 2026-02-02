package org.example.autowire.byname;
/*
 * Bus is NOT responsible for creating Specification.
 * It only declares what it needs.
 *
 * Interview line:
 * "In Spring, a class should declare its dependencies,
 * not create them using the new keyword."
 */
public class Bus {
    /*
     * Bus has a dependency on Specification.
     * This represents a HAS-A relationship.
     *
     * Interview line:
     * "Dependencies are expressed as fields, not created internally."
     */
    private BusSpeci busSpeci1;
public void setBusSpeci(BusSpeci busSpeci){
    this.busSpeci1=busSpeci;
}
    public void getSpecification() {
        System.out.println(busSpeci1.toString());
    }
}
