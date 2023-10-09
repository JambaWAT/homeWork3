// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    System.out.println("Задание1");
    byte apple = 1;
    short apple5Kg = 2;
    int apple50Kg = 3;
    long apple1T = 4;
    float fish = 1.1f;
    double fishCan = 1.2d;
    System.out.println("Значение переменной apple с типом byte равно = " + apple);
    System.out.println("Значение переменной apple5kg с типом shorty равно = " + apple5Kg);
    System.out.println("Значение переменной apple50kg с типом int равно = " + apple50Kg);
    System.out.println("Значение переменной apple1T с типом long равно = " + apple1T);
    System.out.println("Значение переменной fish с типом float равно = " + fish);
    System.out.println("Значение переменной fishCan с типом double равно" + fishCan);
    System.out.println("Задание2");
    float a = 27.12f;
    long b = 987678965549l;
    float c = 2.786f;
    short d = 569;
    short e = -159;
    short f = 27897;
    byte g = 67;
    System.out.println("Задание3");
    byte klassLuda = 23;
    byte klassAnna = 27;
    byte klassKatya = 30;
    short paperPage = 480;
    int paperPerChildren = 480 / (klassAnna + klassKatya + klassLuda);
    System.out.println("На каждого ученика рассчитано " + paperPerChildren + " листов бумаги");
    System.out.println("Задание4");
    byte bottleProducedPer2Min = 16;
    int bottleProducedPer20Min = bottleProducedPer2Min * 10;
    int bottleProducedPer1Day = bottleProducedPer2Min * 720;
    int bottleProducedPer3Days = bottleProducedPer1Day * 3;
    int bottleProducedPer1Month = bottleProducedPer3Days * 10;
    System.out.println("За 2 минуты машина произвела "+ bottleProducedPer2Min + " штук бутылок");
    System.out.println("За 20 минут машина произвела "+ bottleProducedPer20Min + " штук бутылок");
    System.out.println("За 1 день машина произвела "+ bottleProducedPer1Day + " штук бутылок");
    System.out.println("За 3 дня машина произвела "+ bottleProducedPer3Days + " штук бутылок");
    System.out.println("За 1 месяц машина произвела "+ bottleProducedPer1Month + " штук бутылок");
    System.out.println("Задание5");
    byte colorCans = 120;
    byte whiteColorPerKlass = 2;
    byte brownColorPerKlass = 4;
    int colorPerKlass = brownColorPerKlass + whiteColorPerKlass;
    int klassCount = colorCans / colorPerKlass;
    int whiteColorCount = klassCount * whiteColorPerKlass;
    int brownColorCount = klassCount * brownColorPerKlass;
    System.out.println("В школе, где "+ klassCount +" классов, нужно "+ whiteColorCount + " банок белой краски и " + brownColorCount +" банок коричневой краски");
    System.out.println("Задание6");
    int banans = 5 * 80;
    int milk = 105 * 2;
    int iceCream2 = 2 * 100;
    int eggsCount4 = 4 * 70;
    int weightInGram = banans + milk + iceCream2 + eggsCount4;
    System.out.println("вес в граммах равняется: "+weightInGram+" Грамм");
    int grPerKg = 1000;
    float weightKg = weightInGram/(float)grPerKg;
    System.out.println("вес в килограммах равняется: "+weightKg+" Кг");
    System.out.println("Задание7");
    short needLost = 7000;
    short grammPerDay1 = 250;
    short grammPerDay2 = 500;
    int programmTime1 = needLost / grammPerDay1;
    int programmTime2 = needLost / grammPerDay2;
    int programmTimeAverage = (programmTime1 + programmTime2) / 2;
    System.out.println("Для похудения по 250 грамм понадобится: " +programmTime1 + " дней. Для похудения по 500 грамм понадобится: " +programmTime2 + " дней. В среднем понадобится: " +programmTimeAverage + " Дней." );
    System.out.println("Задание8");
    float perIncrInSal = 1.1f;
    int mashaMoney = 67760;
    int denisMoney = 83690;
    int krisMoney = 76230;
    float denisMonUp = denisMoney * perIncrInSal;
    float mashaMonUp = mashaMoney * perIncrInSal;
    float krisMonUp = krisMoney * perIncrInSal;
    int monPerYearD = denisMoney * 12;
    int monPerYearM = mashaMoney * 12;
    int monPerYearK = krisMoney * 12;
    float monPerYearD2= monPerYearD * perIncrInSal;
    float monPerYearM2 = monPerYearM * perIncrInSal;
    float monPerYearK2 = monPerYearK * perIncrInSal;
    float differenceD = monPerYearD2 % monPerYearD;
    float differenceM = monPerYearM2 % monPerYearM;
    float differenceK = monPerYearK2 % monPerYearK;
    System.out.println("Маша теперь получает " + mashaMonUp + " рублей. Годовой доход вырос на " + differenceM +" рублей.");
    System.out.println("Денис теперь получает "+ denisMonUp+ " рублей. Годовой доход вырос на " + differenceD+" рублей");
    System.out.println("Кристиеа теперь получает " + krisMonUp + " рублей. Годовой доход вырос на " + differenceK + " рублей");













  }
}
