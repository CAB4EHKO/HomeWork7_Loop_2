public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        System.out.println("Task 1.");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000 ) {
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна: " + total + " рублей.");
        }
    }
    public static void task2(){
        System.out.println("Task 2.");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print (i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print (i + " ");
        }
    }
}