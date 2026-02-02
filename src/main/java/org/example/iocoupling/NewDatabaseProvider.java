package org.example.iocoupling;


public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "New Database in action";
    }
}
