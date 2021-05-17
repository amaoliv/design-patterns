package io.github.olivmnd.factory;

import io.github.olivmnd.factory.animals.Cat;
import io.github.olivmnd.factory.animals.IAnimal;

public class CatAction extends Action{
    @Override
    protected IAnimal createAction() {
        return new Cat();
    }
}
