package org.example.iocoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationIocLooseCouplingIoc.xml");
        UserManager userManagerWithNewDB =
                (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println("User Manager with new database provider is " + userManagerWithNewDB);
        UserManager userManagerWithDB =
                (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println("User Manager with user database provider is " + userManagerWithDB);
        UserManager userManagerWithWS =
                (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println("User Manager with web service data provider is " + userManagerWithWS);

    }
}
