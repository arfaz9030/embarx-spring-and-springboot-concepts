package org.example.autowire.bytype;

public class BusSpeci {
    private String make;
    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Make='" + make + '\'' +
                '}';
    }
}
