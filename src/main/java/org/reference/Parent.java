package org.reference;

public class Parent {
    private int parentId;
    private Child child;

    public Parent() {
    }

    public Parent(int id, Child child) {
        this.parentId = id;
        this.child = child;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentId=" + parentId +
                ", child=" + child +
                '}';
    }
}
