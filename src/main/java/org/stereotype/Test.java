package org.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("stereotypeConfig.xml");
        Student student1 = applicationContext.getBean("myStudent", Student.class);
        System.out.println(student1);
        System.out.println(student1.hashCode());

        System.out.println("------------------------------------------------------------------------");

        Student student2 = applicationContext.getBean("myStudent", Student.class);
        System.out.println(student2);
        System.out.println(student2.hashCode());

        System.out.println("------------------------------------------------------------------------");

    }
}
