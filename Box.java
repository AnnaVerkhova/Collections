package Collections;

public class Box <T> {
    private int index;
    private T object;
    private Box <T> nextObject;

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Box<T> next() {
        return nextObject;
    }

    public void setNextObject(Box<T> nextObjeck) {
        this.nextObject = nextObjeck;
    }

}
