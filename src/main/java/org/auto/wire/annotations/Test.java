package org.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoAnnotationConfig.xml");
        Employee employee1 = applicationContext.getBean("employee1", Employee.class);
        System.out.println(employee1);

    }
}
