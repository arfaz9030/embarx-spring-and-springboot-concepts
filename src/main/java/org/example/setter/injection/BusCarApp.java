package org.example.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusCarApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationSetterInject.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
        Bus myBus = (Bus) context.getBean("myBus");
        myBus.getSpecification();
    }
}
