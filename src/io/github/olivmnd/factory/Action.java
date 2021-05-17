package io.github.olivmnd.factory;

import io.github.olivmnd.factory.animals.IAnimal;

public abstract class Action {
    void startAction(){
        IAnimal animal = createAction();
        animal.startAction();
    }
    protected abstract IAnimal createAction();
}
