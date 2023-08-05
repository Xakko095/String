public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача1");
        String firstName = " Ivan ";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String fullname = "ФИО сотрудника - ";
        System.out.println(fullname + lastName + firstName + middleName);
    }

    public static void task2() {
        System.out.println("Задача2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}
