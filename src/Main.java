public class Main {
    public static void main(String[] args) {
        // Задача 1.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2.
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3.
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4.
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5.
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6.
        var weight1Boxer = 78.2;
        var weight2Boxer = 82.7;
        System.out.println("Вес двух бойцов - " + (weight1Boxer + weight2Boxer) + " кг");
        System.out.println("Pазницa между весами бойцов - " + (weight2Boxer - weight1Boxer) + " кг");

        // Задача 7.
        System.out.println("Pазницa между весами бойцов - " + (weight2Boxer % weight1Boxer) + " кг");

        // Задача 8.1.
        int a = 640 / 8;
        System.out.println("Всего работников в компании – " + a + " человек");

        // Задача 8.2.
        a = a + 94;
        int b = a * 8;
        System.out.println("Если в компании работает " + a + " человекa, то всего " + b + " часa работы может быть поделено между сотрудниками");

    }
}