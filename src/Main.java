import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home work5");
        System.out.println("Task1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Task2");
        byte clientOs = 1;
        short clientDeviceYear = 2015;
        if (clientOs==0 && clientDeviceYear>=2015){
                    System.out.println("Установите версию приложения для IOS по ссылке");
                    }
        else if (clientOs==0 && clientDeviceYear<2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
        else if (clientOs==1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Task3");
        int year=2021;
        if (year % 4 == 0 && year % 400 !=0){
            System.out.println(year + " Год явлеяется високосным ");
        }
        else if (year % 100 == 0 || year % 400 !=0){
            System.out.println(year + " год не является вискосным ");
        }


        System.out.println("Task4");
        int deliveryDistance = 100;

        if (deliveryDistance <20){
            System.out.println("Потребуется дней: 1 ");
        }
        else if (deliveryDistance>20 && deliveryDistance< 60){
            System.out.println("Потребуется дней: 2 ");
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: 3 ");}
        else {
            System.out.println("Доставки нет ");
        }





        System.out.println("Task5");
        byte monthNumber = 12;
        switch (monthNumber){
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
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого не существует");
        }
    }


        }

