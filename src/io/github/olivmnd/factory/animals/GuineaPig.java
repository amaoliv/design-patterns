package io.github.olivmnd.factory.animals;

public class GuineaPig implements IAnimal{

    @Override
    public void startAction() {
        System.out.println("The guinea pig has lifted its body on back paws");
        getAward();
    }

    @Override
    public void getAward() {
        System.out.println("The guinea pig has received a piece of parrot");

    }
}
