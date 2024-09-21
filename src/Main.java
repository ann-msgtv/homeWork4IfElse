public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        int clientOS = 1;
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введено неверное значение. Укажите 0, если iOS; 1 — Android");
        }

        //task2
        System.out.println("task2");
        int clientOS1 = 0;
        int clientDeviceYear = 2017;
        if (clientDeviceYear<2015 && clientOS1==0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1==1 && clientDeviceYear<2015 ){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 ==0 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1==1 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введено неверное значение. Укажите 0, если iOS; 1 — Android");
        }

        //task3
        System.out.println("task3");
        int year=2021;
        boolean leapYear = (float) (year%4)==0; //год високосный, если разность делится на 4 без остатка
        boolean every100 = (float) (year%100)!=0; //год високосный, если разность не делится на 100 без остатка
        boolean every400 = (float) (year%400)==0; //год високосный, если разность делится на 400 без остатка
        if (year<1584) {
             System.out.println(year+" год не является високосным");
        } else if ((leapYear && every100)||every400) {
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }


        //task4
        System.out.println("task4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("На доставку потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("На доставку потребуется дней: 3");
        }  else {
            System.out.println("Досткавки нет.");
        }



        //task5
        System.out.println("task5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 5:
            case 4:
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
            default:
                System.out.println("Такого времени года не существует");
        }


    }
}