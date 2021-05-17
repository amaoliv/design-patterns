package io.github.olivmnd.adapter.adapters;

import io.github.olivmnd.adapter.tutor.ITutorInstructions;
import io.github.olivmnd.adapter.tutor.Tutor;
import io.github.olivmnd.adapter.utils.Token;

public class GuardianTutorAdapter implements ITutorInstructions {

    private Token token;
    private Tutor guardianTutor;

    public GuardianTutorAdapter(Tutor guardianTutor){
        this.guardianTutor = guardianTutor;
        System.out.println("Adapting GuardianTutor through the Tutor methods");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void teachAction() {
        this.guardianTutor.teachAction();
    }

    @Override
    public void requestAction() {
        this.guardianTutor.requestAction();

    }

    @Override
    public void giveAward() {
        this.guardianTutor.giveAward();

    }
}
