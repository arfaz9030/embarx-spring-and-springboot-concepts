package org.example.autowire.byconstructor;

/*
 * Bus is NOT responsible for creating CarSpecification.
 * It only declares what it needs.
 *
 * Interview line:
 * "In Spring, a class should declare its dependencies,
 * not create them using the new keyword."
 */
public class Bus {
    /*
     * Bus has a dependency on BusSpeci.
     * This represents a HAS-A relationship.
     *
     * Interview line:
     * "Dependencies are expressed as fields, not created internally."
     */
    private BusSpeci busSpeci1;
    public Bus(BusSpeci busSpeci1) {
        this.busSpeci1 = busSpeci1;
    }
    //No need setter funcions to as constructor assiging values
//public void setBusSpeci(BusSpeci busSpeci){
//    this.busSpeci1=busSpeci;
//}
    public void getSpecification() {
        System.out.println(busSpeci1.toString());
    }
}
