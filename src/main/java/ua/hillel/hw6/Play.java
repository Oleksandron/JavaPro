package ua.hillel.hw6;

/*
6. * Створити масив зі слів String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

При запуску програми комп'ютер загадує слово, запитує відповідь у користувача,

порівнює його із загаданим словом та повідомляє чи правильно відповів користувач. Якщо слово не вгадано, комп'ютер показує літери, які стоять на своїх місцях.

apple – загадане

apricot - відповідь гравця

ap############# (15 символів, щоб користувач не міг дізнатися довжину слова)

Для порівняння двох слів посимвольно, можна скористатися:

String str = "apple";

str.charAt(0); - метод, поверне char, який стоїть у слові str на першій позиції

Граємо до тих пір, поки гравець не відгадає слово

Використовуємо лише маленькі літери
 */

import java.util.Scanner;

public class Play {
    public static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void printWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void compare(String check) {
        System.out.println("Спробуй відгадати, введи слово: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if (check.equals(str)) {
            System.out.println("Ви відгадали!!! Це " + check);
        } else {
            String out = "";
            StringBuffer strBuf = new StringBuffer(str);
            for (int i = strBuf.length(); i < 15; i++) {
                strBuf.append("#");
            }
            StringBuffer checkBuf = new StringBuffer(check);
            for (int i = checkBuf.length(); i < 15; i++) {
                checkBuf.append("#");
            }
            for (int i = 0; i < 15; i++) {
                if (strBuf.charAt(i) == checkBuf.charAt(i)) {
                    out = out + strBuf.charAt(i);
                } else out = out + "#";
            }
            System.out.println(out);
            compare(check);
        }
    }

    public static void main(String[] args) {
        System.out.println("Привіт, комп'ютер загадав слово з перелічених: ");
        printWords(words);
        int rnd = (int) (Math.random() * 25);
        System.out.println(words[rnd]);
        compare(words[rnd]);
    }
}
