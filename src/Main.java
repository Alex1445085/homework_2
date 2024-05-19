public class Main {
    public static void main(String[] args) {
        //var ui = 3;
        var dog = 8.0;
        var cat = 3.6;
        var paper = 891;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 3;
        System.out.println("friend = " + friend);

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var differenceWeight = boxer2 - boxer1;
        System.out.println("Масса первого боксера " + boxer1 + " кг, масса второго " + boxer2 + " кг.");
        System.out.println("Общая масса двух боксеров = " + totalWeight);
        System.out.println("Разница в весе боксеров = " + differenceWeight);

        var remainingWeight = boxer2 % boxer1;
        System.out.println("Остаток от деления весов = " + remainingWeight);

        var totalHours = 640;
        var laborCosts = 8; // трудозатраты одного чела
        var peopleInCompany = totalHours / laborCosts;
        System.out.println("Всего работников в компании - " + peopleInCompany + " человек.");
        peopleInCompany = peopleInCompany + 94;
        totalHours = peopleInCompany * laborCosts;
        System.out.println("Если в компании работает " + peopleInCompany + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}