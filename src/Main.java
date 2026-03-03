public class Main {
    public static void main(String[] args) {

        // Задача 1: определение ОС
        int clientOS = 0; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2: ОС + год выпуска
        clientOS = 1;          // для примера поменяем на Android
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 3: високосный год
        int year = 2024;

        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if(year == 0)
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1584");
        }

        // Задача 4: срок доставки
        int deliveryDistance = 95;
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1; // признак невозможности доставки
        }

        if (days != -1) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка невозможна (свыше 100 км)");
        }

        // Задача 5: сезон по номеру месяца
        int monthNumber = 12;

        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        } else {
            System.out.println("Номер месяца должен быть от 1 до 12");
        }
    }
}