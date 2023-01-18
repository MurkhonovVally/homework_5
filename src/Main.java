public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    //Задача 1
    public static void task1() {
        System.out.println("Задача 1");
        int client = 1;
        if ( client == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (client == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    //Задача 2
    public static void task2() {
        System.out.println("Задача 2");
        int client = 1;
        int clientDeviceYear = 2015;
        int modelPhone = 2010;
        if (client == 0 && modelPhone > clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (client == 0 && modelPhone < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client == 1 && modelPhone > clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    //Задача 3
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;

        }
    }
    //Задача 4
    public static void task4() {
        System.out.println("Задача 4");
    }
    //Задача 5
    public static void task5() {
        System.out.println("Задача 5");
    }
}