package com.ilargia.games;

import com.ilargia.games.core.Pool;

public class GameBoardLogic {

    public static int getNextEmptyRow(Pool pool, int column, int row) {
        int rowBelow = row - 1;
        while(rowBelow >= 0 && EntityIndexExtension.getEntitiesWithPosition(pool, column, rowBelow).size == 0) {
            rowBelow -= 1;
        }

        return rowBelow + 1;
    }
}
