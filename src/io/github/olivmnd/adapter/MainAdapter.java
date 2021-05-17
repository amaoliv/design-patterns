package io.github.olivmnd.adapter;

import io.github.olivmnd.adapter.adapters.GuardianTutorAdapter;
import io.github.olivmnd.adapter.guardian.Guardian;
import io.github.olivmnd.adapter.guardian.IGuardianInstructions;
import io.github.olivmnd.adapter.tutor.ITutorInstructions;
import io.github.olivmnd.adapter.tutor.Tutor;

public class MainAdapter {

    public static void main(String[] args) {

       ITutorInstructions instructions = new GuardianTutorAdapter(new Tutor());
       instructions.teachAction();
       instructions.requestAction();
       instructions.giveAward();

       //IT WORKS
       /*
       IGuardianInstructions instructions = new Guardian();
       instructions.requestAction();
       instructions.giveAward();
       */
    }
}
