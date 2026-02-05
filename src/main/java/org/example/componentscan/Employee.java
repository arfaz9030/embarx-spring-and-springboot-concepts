package org.example.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
//    Employee{id=0, name='null', salary=0.0}
//    before @Value default values showing using component scan tag in spring IOc container(.xml)
   @Value("#{1}") // to display numerical use #{}
    private int id;
    @Value("${java.home}") // to display java path use this and let's know other syntax later
private String name;
    @Value("#{4*4}")
    private double salary;

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
