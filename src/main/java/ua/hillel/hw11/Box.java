package ua.hillel.hw11;

public class Box<T> {
    public int size;
    Box<T> box = new Box<>();


    public int size() {
        return size;
    }

    public void addElem(Box<T> elem) {
        for (int i = 0; i < box.size; i++) {
//            if (!(box[i] == null)) continue;
//            box[i] = elem;
        }
    }

//    public void addsElem(Box<T> elem) {
//        for (int i = 0; i < box.size; i++) {
//            if (size > box.size / 2) sizeAdd();
//            if (box[i] != null) continue;
//            box[i] = elem[i];
//        }
    }

//    public void sizeAdd() {
//        Object[] newBox = new Object[box.size * 2];
//        System.arraycopy(box, 0, newBox, 0, box.size);
//        box =  newBox;
//    }

//    public double getWeight(int size) {
//        if(box.equals(Apple)) return size * 1.0;
//        if(box.equals(Orange)) return size * 1.5;
//        return 0.0;
//    }
