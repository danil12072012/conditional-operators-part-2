public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryTimeIsOneDay = 1;
        int deliveryTimeIsTwoDays = deliveryTimeIsOneDay + 1;
        int deliveryTimeIsThreeDays = deliveryTimeIsTwoDays + 1;
        if ( deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTimeIsOneDay);
        }else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Потребуется дней: " + deliveryTimeIsTwoDays);
        }else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("Потребуется дней: " + deliveryTimeIsThreeDays);
        } else {
            System.out.println("К сожалению доставки нет.");
        }


    }
}

