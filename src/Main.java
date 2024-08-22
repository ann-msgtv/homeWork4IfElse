public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        int clientOS = 0;
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task2
        System.out.println("task2");
        int clientOS1 = 1;
        int clientDeviceYear = 2010;
        if (clientDeviceYear<2015 && clientOS1==0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1==1 && clientDeviceYear<2015 ){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS1 ==0 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1==1 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task3
        System.out.println("task3");
        int year=1984;
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

        //task5
        System.out.println("task5");


    }
}