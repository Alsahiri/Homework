public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 10;
        short b = 210;
        int c = 3210;
        long d = 43210L;
        float e = 5.4321f;
        double f = 6.54321;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c =2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 20;
        short paper = 480;
        int paperStudent = paper/(lP+aS+eA);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte capacity = 16;
        byte needTime = 2;
        byte twentyMinutes = 20;
        int firstResult = capacity/needTime * twentyMinutes;
        System.out.println("За " + twentyMinutes + " машина произвела " + firstResult + " штук бутылок");
        byte day = 1;
        int secondResult = capacity/needTime * day * 24 * 60;
        System.out.println("За " + day + " машина произвела " + secondResult + " штук бутылок");
        byte threeDays = 3;
        int thirdResult = capacity/needTime * threeDays * 24 * 60;
        System.out.println("За " + threeDays + " машина произвела " + thirdResult + " штук бутылок");
        short oneMounth = 365;
        int fourthResult = capacity/needTime * oneMounth * 24 * 60;
        System.out.println("За " + oneMounth + " машина произвела " + fourthResult + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte amount = 120;
        byte white = 2;
        byte brown = 4;
        int classes = amount / (white + brown);
        int amountWhite = classes * white;
        int amountBrown = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + amountWhite + " банок белой краски и " +
                amountBrown + " банок коричневой краски ");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        byte bananaWeight = 80;
        short milk = 200;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        int weightCoctail = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + egg * eggWeight;
        float weightCoctailKg = weightCoctail / 1000f;
        System.out.println("Вес коктейля " + weightCoctail + " в граммах");
        System.out.println("Вес коктейля " + weightCoctailKg + " в килограммах");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte extraWeight = 7;
        short minimum = 250;
        short maximum = 500;
        short conversion = 1000;
        int minimumDays = extraWeight * conversion / maximum;
        int maximumDays = extraWeight * conversion / minimum;
        System.out.println(minimumDays);
        System.out.println(maximumDays);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        double mSalary = masha + masha * 0.1;
        double dSalary = denis + denis * 0.1;
        double cSalary = cristina + cristina * 0.1;
        double newM = mSalary * 12;
        double newD = dSalary * 12;
        double newC = cSalary * 12;
        int oldM = masha * 12;
        int oldD = denis * 12;
        int oldC = cristina * 12;
        double differenceM = newM - oldM;
        double differenceD = newD - oldD;
        double differenceC = newC - oldC;
        System.out.println("Маша теперь получает " + mSalary + " рублей. Годовой доход вырос на " +
                differenceM + " рублей");
        System.out.println("Денис теперь получает " + dSalary + " рублей. Годовой доход вырос на " +
                differenceD + " рублей");
        System.out.println("Кристина теперь получает " + cSalary + " рублей. Годовой доход вырос на " +
                differenceC + " рублей");
        // почему-то пропал первый коммит
    }
}