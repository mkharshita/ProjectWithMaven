package org.javaConfig;

import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Student {

    private Samosa samosa;

    public Student(Samosa samosa) {
        super();
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }
    public void study() {
        System.out.println("Student studying");
    }
}
