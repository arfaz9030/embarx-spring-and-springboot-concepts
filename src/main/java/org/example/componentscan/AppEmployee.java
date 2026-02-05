package org.example.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppEmployee {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("componentScanDem.xml");
        Employee employee = (Employee) context.getBean("employee");
        Employee employee1 =  context.getBean("employee", Employee.class);

//below converting string then returning
        System.out.println(employee1.toString());
    }
}
