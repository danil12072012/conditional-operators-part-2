public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");

        }else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
}

