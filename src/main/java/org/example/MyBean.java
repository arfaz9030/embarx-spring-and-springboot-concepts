package org.example;

public class MyBean {
private String beanName;
public String getBeanName() {
	return beanName;
}
public void setBeanName(String name) {
	this.beanName = name;
}

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + beanName + '\'' +
                '}';
    }
}
