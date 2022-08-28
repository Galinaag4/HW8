public class Main {
     // Задача 1
    private static void visYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Год считать високосным");
        } else {
            System.out.println(year + "Год не считается високосным");
        }
    }

    public static void main(String[] args){
        int c = 2021;
        visYear(c);
        int z = 2000;
        int a = 0;
        parametrs(a,z);
        int v= 95;
        int n = 1;
        delivery(v,n);
    }
    // Задача 2
    private static void parametrs(int oS,int year)
    {
        String version = year<2015?"облегченную":"";
        String osM = oS==0?"iOS":"android";

            System.out.printf("Установите %s версиюприложения  для %s по ссылке", version,osM);}
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





