public class Main {
    public static void main(String[] args) {
        int intVar = 9 * 1234567;
        byte byteVar = 50;
        short shortVar = -2500;
        long longVar = intVar * 1234567890L;
        float floatVar = -12.1234456f;
        double doubleVar = floatVar * 99.12345678909;
        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);

        float num1 = 27.12f;
        long num2 = 987_678_965_549L;
        double num3 = 2.786;
        short num4 = 569;
        short num5 = -159;
        int num6 = 27897;
        byte num7 = 67;

        byte LPstudents = 23;
        byte ASstudents = 27;
        byte EAstudents = 30;
        short totalSheets = 480;
        int sheetsPerStudent = totalSheets / LPstudents + ASstudents + EAstudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        int bottlesPerMinute = 16 / 2;
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesIn3Days = bottlesPerDay * 3;
        int bottlesInMonth = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок");

        int totalPaint = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int classes = totalPaint / whitePaintPerClass + brownPaintPerClass;
        int totalWhitePaint = classes * whitePaintPerClass;
        int totalBrownPaint = classes * brownPaintPerClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        int bananas = 5;
        int bananaGram = 80;
        int milkMl = 200;
        int milkGramPer100Ml = 105;
        int iceCreamBricks = 2;
        int iceCreamGramPerBrick = 100;
        int eggs = 4;
        int eggGram = 70;
        int totalBananasWeight = bananas * bananaGram;
        int totalMilkWeight = (milkMl / 100) * milkGramPer100Ml;
        int totalIceCreamWeight = iceCreamBricks * iceCreamGramPerBrick;
        int totalEggsWeight = eggs * eggGram;
        int totalWeightGrams = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        double totalWeightKg = totalWeightGrams / 1000.0;
        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGrams);
        System.out.println("Вес спортзавтрака в килограммах: " + totalWeightKg);

        int weightLossKg = 7;
        int weightLossGrams = weightLossKg * 1000;
        int lossPerDay250 = 250;
        int lossPerDay500 = 500;
        int daysAt250 = weightLossGrams / lossPerDay250;
        int daysAt500 = weightLossGrams / lossPerDay500;
        double averageDays = (daysAt250 + daysAt500) / 2.0;
        System.out.println(daysAt250 + " дней уйдёт при похудении на 250 г в день");
        System.out.println(daysAt500 + " дней при похудении на 500 г в день");
        System.out.println("В среднем для похудения может потребоваться " + averageDays + " дней");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double mashaNewSalary = mashaSalary * 1.10;
        double denisNewSalary = denisSalary * 1.10;
        double kristinaNewSalary = kristinaSalary * 1.10;
        double mashaIncomeIncrease = (12 * mashaNewSalary) - (12 * mashaSalary);
        double denisIncomeIncrease = (12 * denisNewSalary) - (12 * denisSalary);
        double kristinaIncomeIncrease = (12 * kristinaNewSalary) - (12 * kristinaSalary);
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaIncomeIncrease + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisIncomeIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaIncomeIncrease + " рублей");
    }
}