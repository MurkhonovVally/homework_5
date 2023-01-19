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
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        }
    //Задача 4
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            int days = 1;
            if (deliveryDistance < 20) {
                days = days;
            }
            if (deliveryDistance > 20) {
                days = days + 1;
            }
            if (deliveryDistance > 60) {
                days = days + 1;
            }
            System.out.println("Потребуется дней: " + days);
        }
    }

    //Задача 5
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}