package org.example.componentscan.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class AppEmployee {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeUseAnnotate employee = (EmployeeUseAnnotate) context.getBean("employeeannotate");
        EmployeeUseAnnotate employee1 =  context.getBean("employeeannotate", EmployeeUseAnnotate.class);
        System.out.println(employee);

    }
}
