package io.github.olivmnd.adapter.tutor;

import io.github.olivmnd.adapter.utils.Token;

public interface ITutorInstructions {

    Token authToken();
    void teachAction();
    void requestAction();
    void giveAward();
}
