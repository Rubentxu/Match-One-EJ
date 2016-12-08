package com.ilargia.games;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ObjectSet;
import com.ilargia.games.components.Position;
import com.ilargia.games.core.CoreMatcher;
import com.ilargia.games.core.Entity;
import com.ilargia.games.core.Pool;
import com.ilargia.games.core.Pools;
import com.ilargia.games.entitas.EntityIndex;


public class MatchOne extends ApplicationAdapter {
    public static final String PositionKey = "Position";

    public static void addEntityIndices(Pools pools) {
        EntityIndex<String> positionIndex = new EntityIndex(
                pools.core.getGroup(CoreMatcher.Position()),
                (e, c) -> {
                    Position positionComponent = (Position) c;
                    return positionComponent != null
                            ? positionComponent.x + "," + positionComponent.y
                            : ((Entity)e).getPosition().x + "," + ((Entity)e).getPosition().y;
                }
        );

        pools.core.addEntityIndex(PositionKey, positionIndex);
    }

    public static ObjectSet<com.ilargia.games.entitas.Entity> getEntitiesWithPosition(Pool pool, int x, int y) {
        EntityIndex<String> index = (EntityIndex<String>) pool.getEntityIndex(PositionKey);
        return index.getEntities(x + "," + y);
    }

    @Override
    public void create() {

    }

    @Override
    public void render() {

    }

    @Override
    public void dispose() {


    }
}