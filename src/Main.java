public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Task 1.");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна: " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Task 2.");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Task 3.");
        int countryY = 12_000_000;
        int fertilityOf1000 = 17;
        int mortalityOf1000 = 8;
        int years = 0;
        while (years < 10) {
            countryY = (countryY / 1000) * (fertilityOf1000 - mortalityOf1000) + countryY;
            years++;
            System.out.println("Год " + years + " численость населения составляет: " + countryY + " человек.");
        }
    }

    public static void task4() {
        System.out.println("Task 4.");
        int sumOfMons = 15_000;
        int totalDeposit = 0;
        int month = 0;
        int k = 7;
        while (totalDeposit < 12_000_000) {
            sumOfMons = (sumOfMons / 100) * k + sumOfMons;
            totalDeposit = totalDeposit + sumOfMons;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна: " + totalDeposit + " рублей.");
        }
    }

    public static void task5() {
        System.out.println("Task 5.");
        int sumOfMons = 15_000;
        int totalDeposit = 0;
        int month = 0;
        int k = 7;
        while (totalDeposit <= 12_000_000) {
            sumOfMons = (sumOfMons / 100) * k + sumOfMons;
            totalDeposit = totalDeposit + sumOfMons;
            if (month % 6 == 0) {
            System.out.println("Месяц " + month + " сумма накоплений равна: " + totalDeposit + " рублей.");
        }
            month++;
        }
    }
}