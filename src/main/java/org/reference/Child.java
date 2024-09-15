package org.reference;

public class Child {
    private int childId;

    public Child() {
    }

    public Child(int childId) {
        this.childId = childId;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    @Override
    public String toString() {
        return "Child{" +
                "childId=" + childId +
                '}';
    }
}
