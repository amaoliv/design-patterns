package io.github.olivmnd.factory.animals;

public class Dog implements IAnimal{
    @Override
    public void startAction() {
        System.out.println("The dog has given its paw");
        getAward();

    }

    @Override
    public void getAward() {
        System.out.println("The dog has received a snack!");

    }
}
