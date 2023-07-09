package ua.hillel.hw21;

public class ProjectTestRunner {
    public static void testNameString(Class cl) {
        System.out.println(cl.getName());
    }

    public static void testNameClass(Class cl) {
        System.out.println(cl.getClass());
    }

    public static void testNamesString(Class cl1,Class cl2) {
        System.out.println(cl1.getName());
        System.out.println(cl2.getName());
    }

    public static void testNamesClass(Class cl1,Class cl2) {
        System.out.println(cl1.getClass());
        System.out.println(cl2.getClass());
    }

    public static void locationPakage(Class lp) {
        System.out.println(lp.getPackage());
    }
}
