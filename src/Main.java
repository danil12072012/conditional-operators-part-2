public class Main {
    public static void main(String[] args) {
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима.");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10,  11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет.");


        }


    }
}

