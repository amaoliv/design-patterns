package io.github.olivmnd.adapter.tutor;

import io.github.olivmnd.adapter.utils.Token;

public class Tutor implements ITutorInstructions{

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void teachAction() {
        this.token = authToken();
        System.out.println("The Tutor has taught a new action");

    }

    @Override
    public void requestAction() {
        this.token = authToken();
        System.out.println("The Tutor has requested an action");

    }

    @Override
    public void giveAward() {
        System.out.println("The Tutor is giving an award");

    }
}
