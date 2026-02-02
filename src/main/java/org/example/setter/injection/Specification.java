package org.example.setter.injection;

/*
 * Specification is a simple data holder.
 * It does not depend on Spring.
 *
 * Interview line:
 * "Spring beans should be simple POJOs without framework dependency."
 */
public class Specification {

    /*
     * These are plain fields.
     * Values will be injected using setter injection.
     */
    private String make;
    private String model;

    /*
     * Default constructor is implicitly provided by Java.
     *
     * Interview line:
     * "Default constructor is required for setter injection
     * because Spring first creates the object and then sets values."
     */

    public String getMake() {
        return make;
    }

    /*
     * Setter Injection:
     * Spring calls this after creating the object.
     */
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    /*
     * Setter Injection:
     * Enables flexible configuration without changing code.
     *
     * Interview line:
     * "Setter injection is useful for optional or configurable values."
     */
    public void setModel(String model) {
        this.model = model;
    }

    /*
     * Overridden for better logging and debugging.
     */
    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
