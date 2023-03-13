public class Main {

    public static void main(String[] args) {
        task1();// ЗАДАЧА 1
        task2();// ЗАДАЧА 2
        task3();// ЗАДАЧА 3

    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich ";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

}