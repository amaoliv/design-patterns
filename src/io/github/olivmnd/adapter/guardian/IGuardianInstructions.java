package io.github.olivmnd.adapter.guardian;

import io.github.olivmnd.adapter.tutor.ITutorInstructions;
import io.github.olivmnd.adapter.utils.Token;

public interface IGuardianInstructions {

    Token authToken();
    void requestAction();
    void giveAward();
}
