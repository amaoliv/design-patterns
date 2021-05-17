package io.github.olivmnd.factory;

import io.github.olivmnd.factory.animals.Dog;
import io.github.olivmnd.factory.animals.IAnimal;

public class DogAction extends Action{
    @Override
    protected IAnimal createAction() {
        return new Dog();
    }
}
