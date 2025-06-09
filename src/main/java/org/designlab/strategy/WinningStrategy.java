package org.designlab.strategy;

import org.designlab.model.Board;
import org.designlab.model.Player;

/**
 * Author: subramanyamadimulam
 * Date: 05/06/25
 */

public interface WinningStrategy {

    boolean checkWinner(Board board, Player player, int row, int column);
}
