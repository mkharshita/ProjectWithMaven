package org.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycleConfig.xml");

        System.out.println("------------------------");

        Samosa samosa1 = (Samosa) applicationContext.getBean("samosa1");
        System.out.println(samosa1);
        applicationContext.registerShutdownHook();

        System.out.println("------------------------");

        Pepsi pepsi1 = (Pepsi) applicationContext.getBean("pepsi1");
        System.out.println(pepsi1);

        System.out.println("------------------------");

    }
}
