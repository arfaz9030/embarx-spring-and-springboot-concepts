package org.example.setter.injection;

public class Bus {

    /*
     * Dependency field.
     */
    private BusSpeci busSpecification;

    /*
     * This setter is MANDATORY for XML property injection.
     *
     * XML <property name="busSpecification"/>
     * → Spring looks for setBusSpecification(...)
     */
    public void setBusSpecification(BusSpeci busSpeci) {
        this.busSpecification = busSpeci;
    }

    public void getSpecification() {
        System.out.println(busSpecification.toString());
    }
}
