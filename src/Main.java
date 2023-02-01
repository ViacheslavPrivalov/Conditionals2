public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        int deliveryDistance = 95;
        int estimatedDeliveryTime = 0;
        if (deliveryDistance < 20) {
            estimatedDeliveryTime += 1;
            System.out.println("Потребуется дней: " + estimatedDeliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            estimatedDeliveryTime += 2;
            System.out.println("Потребуется дней: " + estimatedDeliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            estimatedDeliveryTime += 3;
            System.out.println("Потребуется дней: " + estimatedDeliveryTime);
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача5");
        int monthNumber = 6;
        if (monthNumber > 12) {
            System.out.println("Такого месяца нет");
        } else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Сезон Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Сезон Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Сезон Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Сезон Осень");
                    break;
            }
        }
    }
}