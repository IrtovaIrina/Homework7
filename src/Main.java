public class Main {
    public static void main(String[] args) {
        //задание 1
        int monthlySavings = 15000;
        int savings = 0;
        int month = 0;
        while (savings <= 2459000) {
            savings += monthlySavings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        //задание 2
        int count = 1;
        while (count < 11) {
            System.out.print(count + " ");
            count++;
        }
        System.out.print("\n");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        //задание 3
        int yearCount = 10;
        int population = 12000000;
        for (int i = 1; i <= yearCount; i++) {
            population = population + (population / 1000 * 17) - (population / 1000 * 8);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.print("\n");
        //задание 4
        int depositAmount = 15000;
        double percent = 0.07;
        double savingAmount = 15000;
        int monthCount = 1;
        System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + depositAmount + " рублей");
        while (savingAmount < 12000000) {
            monthCount++;
            savingAmount += (int) (savingAmount * percent) + depositAmount;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + (int) savingAmount + " рублей");
        }
        System.out.print("\n");
        //задание 5
        percent = 0.07;
        int savingAmount2 = 15000;
        monthCount = 1;
        while (savingAmount2 < 12000000) {
            monthCount++;
            savingAmount2 += (int) (savingAmount2 * percent) + depositAmount;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + savingAmount2 + " рублей");
            }
        }
        System.out.print("\n");
        //задание 6
        int savingAmount3 = 15000;
        percent = 0.07;
        for (int i = 2; i <= 9 * 12; i++) {
            savingAmount3 += (int) (savingAmount3 * percent) + depositAmount;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savingAmount3 + " рублей");
            }
        }
        System.out.print("\n");
        //задание 7
        int mothFirstFriday = 6;
        while (mothFirstFriday <= 31){
            System.out.println("Сегодня пятница, " + mothFirstFriday +"-е число. Необходимо подготовить отчет");
            mothFirstFriday+=7;
        }
        System.out.print("\n");
        //задание 8
        int year200YearsAgo = 1823;
        int year100YearsAhead = 2123;
        for (int i = 0;i <= year100YearsAhead;i+=79){
            if (i >= year200YearsAgo && i <=year100YearsAhead){
                System.out.println(i);
            }
        }
    }
}