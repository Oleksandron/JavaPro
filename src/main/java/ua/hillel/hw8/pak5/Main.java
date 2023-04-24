package ua.hillel.hw8.pak5;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.members();
        human.obstacles();
        human.overcome();
        Human[] humans = new Human[5];
        Wall[] walls = new Wall[5];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
            walls[i] = new Wall();
            humans[i].obstacles();
            walls[i].overcome();
        }

    }
}
