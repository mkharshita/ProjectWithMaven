package org.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("stereotypeConfig.xml");
        Student student = applicationContext.getBean("myStudent", Student.class);
        System.out.println(student);
    }
}
