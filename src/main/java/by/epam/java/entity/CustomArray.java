package by.epam.java.entity;

public class CustomArray {

    private long id;
    private String name;

    private Object[] array;
    private Object[] extraArray;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public Object[] getExtraArray() {
        return extraArray;
    }

    public void setExtraArray(Object[] extraArray) {
        this.extraArray = extraArray;
    }
}