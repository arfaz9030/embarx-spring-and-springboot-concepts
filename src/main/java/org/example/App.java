package org.example;

import org.example.constructor.injection.Bus;
import org.example.constructor.injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Entry point of the application.
 *
 * Interview line:
 * "ApplicationContext is the Spring container
 * responsible for creating and managing beans."
 */
public class App {
    public static void main(String[] args) {

        /*
         * Loading Spring context from XML.
         * All beans inside this XML belong to the same container.
         *
         * Interview line:
         * "Beans must be defined in the same application context
         * to resolve constructor dependencies."
         */
        ApplicationContext context
        = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        MyBean bean =(MyBean) context.getBean(MyBean.class);
        System.out.println("Bean: " + bean);

        /*
         * Loading Spring context from XML.
         * All beans inside this XML belong to the same container.
         *
         * Interview line:
         * "Beans must be defined in the same application context
         * to resolve constructor dependencies."
         */
        ApplicationContext carContext =
                new ClassPathXmlApplicationContext("applicationConstructorInject.xml");

        /*
         * Requesting Car bean from Spring.
         * Spring resolves constructor dependencies automatically.
         */
        Car myCar = (Car) carContext.getBean("myCar");

        /*
         * Business method call.
         * At this point, all dependencies are already injected.
         */
        myCar.displayDetails();

        Bus myBus = (Bus) carContext.getBean("myBus");
        myBus.getSpecification();
    }
}
