package org.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("standaloneCollectionsConfig.xml");
        Person person1 = applicationContext.getBean("person1",Person.class);
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());
        System.out.println(person1.getFeesStructure().getClass().getName());
    }
}
