package ua.hillel.hw3;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;

    private String email;
    private int tel;
    private int age;

    public Employee(String firstName, String lastName, String position, String email, int tel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", tel=" + tel +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee my = new Employee("Oleksandr","Fedonenko", "IT","user@gmail.com", 123456789,52);
        System.out.println(my);
    }
}
