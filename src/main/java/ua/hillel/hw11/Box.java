package ua.hillel.hw11;

public class Box<T> {
    public int size;
    Box[] box = new Box[10];

    public Box(Box[] box) {
        this.box = box;
    }

    public int size() {
        return size;
    }

    public void addElem(Box elem) {
        for (int i = 0; i < box.length; i++) {
            if (box[i] != null) continue;
            box[i] = elem;
        }
    }

    public void addsElem(Box[] elem) {
        for (int i = 0; i < box.length; i++) {
            if (size > box.length / 2) sizeAdd();
            if (box[i] != null) continue;
            box[i] = elem[i];
        }
    }

    public void sizeAdd() {
        Object[] newBox = new Object[box.length * 2];
        System.arraycopy(box, 0, newBox, 0, box.length);
        box = (Box[]) newBox;
    }

    public double getWeight(int size) {
        if(box.equals(Apple)) return size * 1.0;
        if(box.equals(Orange)) return size * 1.5;
        return 0.0;
    }
}
