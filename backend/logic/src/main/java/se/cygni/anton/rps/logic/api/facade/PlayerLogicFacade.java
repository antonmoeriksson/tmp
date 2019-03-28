package se.cygni.anton.rps.logic.api.facade;

import se.cygni.anton.rps.data.api.GameFacade;
import se.cygni.anton.rps.data.api.PlayerFacade;
import se.cygni.anton.rps.data.impl.Player;

public interface PlayerLogicFacade {

    PlayerFacade createPlayer(String name);
    boolean execMove(PlayerFacade playerFacade, String move);
    PlayerFacade getPlayer(String name);


}
