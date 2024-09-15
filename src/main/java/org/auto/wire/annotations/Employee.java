package org.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    @Autowired
    private Address address;

    public Employee() {
    }

    @Autowired
    public Employee(Address address) {
        System.out.println("Constructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        System.out.println("Setter");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
