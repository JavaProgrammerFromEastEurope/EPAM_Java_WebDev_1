package by.java.epam.entity;

public abstract class CustomArray {

    private Object[] array;
    private Object[] extraArray;

    protected Object[] getArray() {
        return array;
    }

    protected void setArray(Object[] array) {
        this.array = array;
    }

    public Object[] getExtraArray() {
        return extraArray;
    }

    public void setExtraArray(Object[] extraArray) {
        this.extraArray = extraArray;
    }
}