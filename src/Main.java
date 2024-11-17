//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("ДОМАШКА 2.2");

        System.out.println("Задача 1");

        int dzInt = 500000;
        byte dzByte = -15;
        short dzShort = 1500;
        long dzLong = 900001L;
        float dzFloat = 0.7f;
        double dzDouble = -25.25;

        System.out.println("Значение переменной а с типом int равно " + dzInt);
        System.out.println("Значение переменной b с типом byte равно " + dzByte);
        System.out.println("Значение переменной c с типом short равно " + dzShort);
        System.out.println("Значение переменной d с типом long равно " + dzLong);
        System.out.println("Значение переменной e с типом float равно " + dzFloat);
        System.out.println("Значение переменной f с типом double равно " + dzDouble);

        System.out.println("Задача 2");

        double dzDouble2 = 27.12;
        long dzLong2 = 987678965549L;
        float dzFloat2 = 2.786f;
        int dzInt2 = 569;
        short dzShort2 = -159;
        short dzShort21 = 27897;
        byte dzByte2 = 67;

        System.out.println("Задача 3");

        int numStudentsLudmila = 23;
        int numStudentsAnna = 27;
        int numStudentsEkaterina = 30;
        int totalSheets = 480;
        int totalStudents = numStudentsLudmila + numStudentsAnna + numStudentsEkaterina;
        double sheetsPerStudent = (double) totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");

        System.out.println("Задача 4");

        int bottlesPer2Minutes = 16;
        int minutesIn2Minutes = 2;
        double bottlesPerMinute = (double) bottlesPer2Minutes / minutesIn2Minutes;
        int productionIn20Minutes = (int) (bottlesPerMinute * 20);
        System.out.println("За 20 минут машина произвела " + productionIn20Minutes + " штук бутылок.");
        int minutesInADay = 24 * 60;
        int productionInADay = (int) (bottlesPerMinute * minutesInADay);
        System.out.println("За 1 сутки машина произвела " + productionInADay + " штук бутылок.");
        int minutesIn3Days = 3 * minutesInADay;
        int productionIn3Days = (int) (bottlesPerMinute * minutesIn3Days);
        System.out.println("За 3 дня машина произвела " + productionIn3Days + " штук бутылок.");
        int minutesInAMonth = 30 * minutesInADay;
        int productionInAMonth = (int) (bottlesPerMinute * minutesInAMonth);
        System.out.println("За 1 месяц машина произвела " + productionInAMonth + " штук бутылок.");

        System.out.println("Задача 5");

        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int numberOfClasses;
        int totalWhiteCans;
        int totalBrownCans;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;
        numberOfClasses = totalCans / cansPerClass;
        totalWhiteCans = numberOfClasses * whiteCansPerClass;
        totalBrownCans = numberOfClasses * brownCansPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " +
                totalWhiteCans + " банок белой краски и " +
                totalBrownCans + " банок коричневой краски.");

        System.out.println("Задача 6");

        int numberOfBananas = 5;
        int weightPerBanana = 80;
        int milkVolumeInMl = 200;
        double weightPer100MlMilk = 105;
        double weightPerMlMilk = weightPer100MlMilk / 100;
        int numberOfIceCreamPacks = 2;
        int weightPerIceCreamPack = 100;
        int numberOfEggs = 4;
        int weightPerEgg = 70;
        int totalWeightBananas = numberOfBananas * weightPerBanana;
        double totalWeightMilk = milkVolumeInMl * weightPerMlMilk;
        int totalWeightIceCream = numberOfIceCreamPacks * weightPerIceCreamPack;
        int totalWeightEggs = numberOfEggs * weightPerEgg;
        double totalWeightInGrams = totalWeightBananas + totalWeightMilk +
                totalWeightIceCream + totalWeightEggs;
        double totalWeightInKilograms = totalWeightInGrams / 1000;
        System.out.println("Общий вес спортзавтрака: " + totalWeightInGrams + " грамм.");
        System.out.println("Общий вес спортзавтрака: " + totalWeightInKilograms + " килограмм.");

        System.out.println("Задача 7");

        double weightToLoseKg = 7.0;
        double weightToLoseGrams = weightToLoseKg * 1000;
        double lossPerDayLow = 250;
        double lossPerDayHigh = 500;
        double daysToLoseLow = weightToLoseGrams / lossPerDayLow;
        double daysToLoseHigh = weightToLoseGrams / lossPerDayHigh;
        double averageDays = (daysToLoseLow + daysToLoseHigh) / 2;
        System.out.printf("Если спортсмен будет терять по 250 грамм в день, похудение займет: %.2f дней.%n", daysToLoseLow);
        System.out.printf("Если спортсмен будет терять по 500 грамм в день, похудение займет: %.2f дней.%n", daysToLoseHigh);
        System.out.printf("Среднее количество дней для похудения составит: %.2f дней.%n", averageDays);

        System.out.println("Задача 8");

        double currentSalaryMasha = 67760;
        double currentSalaryDenis = 83690;
        double currentSalaryKristina = 76230;
        double salaryIncreasePercentage = 0.10;

        // Маша
        double newSalaryMasha = currentSalaryMasha * (1 + salaryIncreasePercentage);
        double currentAnnualIncomeMasha = currentSalaryMasha * 12;
        double newAnnualIncomeMasha = newSalaryMasha * 12;
        double incomeDifferenceMasha = newAnnualIncomeMasha - currentAnnualIncomeMasha;
        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",
                newSalaryMasha, incomeDifferenceMasha);

        // Денис
        double newSalaryDenis = currentSalaryDenis * (1 + salaryIncreasePercentage);
        double currentAnnualIncomeDenis = currentSalaryDenis * 12;
        double newAnnualIncomeDenis = newSalaryDenis * 12;
        double incomeDifferenceDenis = newAnnualIncomeDenis - currentAnnualIncomeDenis;
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",
                newSalaryDenis, incomeDifferenceDenis);

        // Кристина
        double newSalaryKristina = currentSalaryKristina * (1 + salaryIncreasePercentage);
        double currentAnnualIncomeKristina = currentSalaryKristina * 12;
        double newAnnualIncomeKristina = newSalaryKristina * 12;
        double incomeDifferenceKristina = newAnnualIncomeKristina - currentAnnualIncomeKristina;
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",
                newSalaryKristina, incomeDifferenceKristina);
        }
    }