package org.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoConfig.xml");
        Employee employee1 = applicationContext.getBean("employee1",Employee.class);
        Employee employee2 = applicationContext.getBean("employee1",Employee.class);
        Employee employee3 = applicationContext.getBean("employee1",Employee.class);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
