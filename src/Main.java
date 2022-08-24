public class Main {
     // Задача 1
    static void visYear(int x) {
        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            System.out.println(x + "Год считать високосным");
        } else {
            System.out.println(x + "Год не считается високосным");
        }
    }

    public static void main(String[] args){
        int c = 2021;
        visYear(c);
        int z = 2000;
        int a = 0;
        parametrs(a,z);
    }
    // Задача 2
    static void parametrs(int oS,int year){
        if (oS == 0 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");}
        if (oS == 1 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Аndroid по ссылке");}}
    // Задача 3.


    }



