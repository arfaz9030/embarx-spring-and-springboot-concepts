package org.example.constructor.injection;

public class Bus {
    private BusSpeci busSpeci;
    public Bus(BusSpeci specification) {
        this.busSpeci = specification;
    }
    public void getSpecification() {
        System.out.println(busSpeci.toString());
    }
}
