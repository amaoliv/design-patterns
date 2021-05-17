package io.github.olivmnd.factory.animals;

public class Cat implements IAnimal{
    @Override
    public void startAction() {
        System.out.println("The cat has mewed");
        getAward();
    }

    @Override
    public void getAward() {
        System.out.println("The cat has received a piece of fish");

    }
}
