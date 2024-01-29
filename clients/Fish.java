package HW_OOP.clients;

import java.time.LocalDate;

public class Fish extends Animal {

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
        super();
    }

    // метод двигаться
    public void toGo() {
        System.out.println("Издеваешся? Да у меня ног нету");
    }

    // метод лететь
    public void toFly() {
        System.out.println("Я падаю, я неумею летать!!!");
    }
}
