public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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

    public static void task6() {
        System.out.println("Task 6.");
        int sumOfMons = 15_000;
        int totalDeposit = 0;
        int timeInMons = 9 * 12;
        int k = 7;
        int countTime = 0;
        while (countTime <= timeInMons) {
            sumOfMons = (sumOfMons / 100) * k + sumOfMons;
            totalDeposit = totalDeposit + sumOfMons;
            if (countTime % 6 == 0 && countTime > 0) {
                System.out.println("Сумма через " + countTime + " месяцев: " + totalDeposit + " рублей.");
            }
            countTime++;
        }
        System.out.println("Всего месяцев: " + countTime);
    }
    public static void task7() {
        System.out.println("Task 7.");
        int firstFriday = 3;
        while (firstFriday <= 31) {
            if (firstFriday % 7 == 0 || firstFriday > 0) {
                System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчёт.");
                firstFriday += 7;
            }
        }
    }
}