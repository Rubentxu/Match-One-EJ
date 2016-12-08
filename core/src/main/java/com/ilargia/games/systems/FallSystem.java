package com.ilargia.games.systems;

import com.badlogic.gdx.utils.Array;
import com.ilargia.games.components.GameBoard;
import com.ilargia.games.core.CoreMatcher;
import com.ilargia.games.core.Entity;
import com.ilargia.games.core.Pool;
import com.ilargia.games.entitas.interfaces.IReactiveSystem;
import com.ilargia.games.entitas.interfaces.ISetPool;
import com.ilargia.games.entitas.matcher.TriggerOnEvent;

import java.util.Iterator;


public class FallSystem implements ISetPool<Pool>, IReactiveSystem {
    private Pool _pool;

    @Override
    public TriggerOnEvent getTrigger() {
        return CoreMatcher.GameBoardElement().OnEntityAdded();
    }


    @Override
    public void setPool(Pool pool) {
        _pool = pool;
    }

    @Override
    public void execute(Array entities) {
        GameBoard gameBoard = _pool.getGameBoard();

        for(int column = 0; column < gameBoard.columns; column++) {
            for(int row = 1; row < gameBoard.rows; row++) {
                movables = _pool.get(column, row)
                        .Where(e => e.isMovable)
                                    .ToArray();

                foreach(var e in movables) {
                    moveDown(e, column, row);
                }
            }
        }

        Iterator<Entity> it = entities.iterator();

        while (it.hasNext()) {
            _pool.destroyEntity(it.next());
        }
    }


}
