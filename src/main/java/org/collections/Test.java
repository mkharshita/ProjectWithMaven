package org.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionConfig.xml");

        Employee employee1 = (Employee) applicationContext.getBean("employee1");

        System.out.println(employee1.getName());
        System.out.println(employee1.getPhones());
        System.out.println(employee1.getAddresses());
        System.out.println(employee1.getCourses());
        System.out.println(employee1.getProperties());
    }
}
