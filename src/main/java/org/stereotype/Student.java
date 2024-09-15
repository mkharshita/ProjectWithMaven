package org.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("myStudent")
public class Student {

    @Value("Harshita")
    private String studentName;

    @Value("Moradabad")
    private String city;

    @Value("#{mybestfriends}")
    private List<String> bestFriends;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getBestFriends() {
        return bestFriends;
    }

    public void setBestFriends(List<String> bestFriends) {
        this.bestFriends = bestFriends;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", bestFriends=" + bestFriends +
                '}';
    }

}
