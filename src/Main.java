import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //task 1();
    }

    private static void task1() {
        Object years;
        printIsLeop(2020);
    }

    private static void printIsLeop(int years) {
    }


    private static boolean iaLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосны год");
        } else {
            System.out.println("Не високосный год");
        }

    }

    private static void printInstallastuonMasage(int os, int productionYear) {
        string versionMassage = productionYear < 2015 ? "облегченный" : "";
        string osMessage = os == 0 ? "iOS" : "android";
        if (os == 0) {
            if (productionYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iSO по ссылке");
            } else {
                if (productionYear < 2015) {
                    System.out.println("Установите версию приложения для iSO по ссылке");
                }
            } else{
                if (productionYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для android по ссылке");
                }
            }
        } else {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }

    }

}

    private static void printCalculateDeliveryDays(int distance) {
        int start = 20;
        int step = 40;
        int result; // кол во дней
        if (distance < start) {
            resulf = 1;
        } else {
            result = (Math.abs((distance - start) + 2));
        }
        System.out.println("Потребуется доставки дней:" + result);
        }
    }
    }
