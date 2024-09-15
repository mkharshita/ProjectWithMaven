package org.auto.wire;

public class Employee {
    private Address address;

    public Employee() {
    }

    public Employee(Address address) {
        System.out.println("Constructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

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
