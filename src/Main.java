public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }


        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        }


        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}