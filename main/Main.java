package HW_OOP.main;

import HW_OOP.clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай"));

        cat.setIllness(new Illness(null));

        Animal testAnimal = new Animal();
        System.out.println(testAnimal.getNickName());

        Cat catty = new Cat();
        Dog goodBoy = new Dog();
        Fish bubble = new Fish();
        Bird duck = new Bird();

        // Вызываем действия животных
        catty.meow();
        System.out.println();
        goodBoy.toGo();
        goodBoy.toSwim();
        goodBoy.toFly();
        System.out.println();
        bubble.toGo();
        bubble.toSwim();
        bubble.toFly();
        System.out.println();
        duck.toGo();
        duck.toSwim();
        duck.toFly();

    }
}
