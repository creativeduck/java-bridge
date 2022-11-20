package bridge.presentation;

import bridge.PlayerMap;
import bridge.data.GameMessage;

import static bridge.data.GameMark.*;

public class OutputView {
    public void printGameStart() {
        System.out.println(GameMessage.GAME_START.getMessage());
    }

    public void printInputBridge() {
        System.out.println(GameMessage.INPUT_BRIDGE_SIZE.getMessage());
    }

    public void printBridgeSize(int bridgeSize) {
        System.out.println(bridgeSize);
        System.out.println();
    }

    public void printInputMove() {
        System.out.println(GameMessage.INPUT_MOVE.getMessage());
    }

    public void printInputRetryCommand() {
        System.out.println(GameMessage.INPUT_RETRY_COMMAND.getMessage());
    }

    public void printRetryCommand(String retryCommand) {
        System.out.println(retryCommand);
    }

    public void printFinalResult() {
        System.out.println(GameMessage.GAME_FINAL_RESULT.getMessage());
    }

    private void printColumnMap(int row, PlayerMap playerMap, int position) {
        for (int j = 0; j < position; j++) {
            if (j > 0) {
                System.out.print(BLANK.getMark() + VERTICAL_BAR.getMark());
            }
            System.out.print(BLANK.getMark() + playerMap.getMark(row, j));
        }
        System.out.println(BLANK.getMark() + BRAKETS_RIGHT.getMark());
    }
}

