package io.github.olivmnd.factory;

import io.github.olivmnd.factory.animals.GuineaPig;
import io.github.olivmnd.factory.animals.IAnimal;

public class GuineaPigAction extends Action {
    @Override
    protected IAnimal createAction() {
        return new GuineaPig();
    }
}
