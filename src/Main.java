public class Main {
     // Задача 1
    private static void visYear (char year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Год считать високосным");
        } else {
            System.out.println(year + "Год не считается високосным");
        }
    }

    public static void main(String[] args){
        char c = 2021;
        visYear(c);
        int z = 2000;
        int a = 0;
        parametrs(a,z);
        int v= 95;
        int n = 1;
        delivery(v,n);
    }
    // Задача 2
    private static void parametrs(int oS,int year){
        if (oS == 0 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");}
        if (oS == 1 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Аndroid по ссылке");}}
    // Задача 3.
    private static void delivery(int deliveryDistance, int deliveryDays){

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("потребуется дней" +  deliveryDays);

        }

    }





