package HW_OOP.clients;

import java.time.LocalDate;

public class Dog extends Animal {

    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    public void toFly() {
        System.out.println("Я падаю, я неумею летать!!!");
    }
}
