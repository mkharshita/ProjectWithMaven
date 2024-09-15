package org.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("referenceConfig.xml");
        Parent parent1 = (Parent) applicationContext.getBean("parent1");
        Parent parent2 = (Parent) applicationContext.getBean("parent2");
        Parent parent3 = (Parent) applicationContext.getBean("parent3");
        System.out.println(parent1);
        System.out.println(parent2);
        System.out.println(parent3);
        System.out.println(parent1.getChild());
    }
}
