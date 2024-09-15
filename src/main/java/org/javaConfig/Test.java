package org.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = applicationContext.getBean("getStudent", Student.class);
        System.out.println(student);
        student.study();
        student.getSamosa().display();

        Student student1 = applicationContext.getBean("student1",Student.class);
        student1.study();
    }
}
