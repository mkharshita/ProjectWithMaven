package org.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "org.javaConfig")
public class JavaConfig {

    @Bean
    public Samosa getSamosa() {
        return new Samosa();
    }
    @Bean
    public Student getStudent() {
        Student student = new Student(getSamosa());
        return student;
    }

}
