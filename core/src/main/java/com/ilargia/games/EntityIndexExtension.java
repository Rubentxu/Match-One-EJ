package com.ilargia.games;


import com.badlogic.gdx.utils.ObjectSet;
import com.ilargia.games.components.Position;
import com.ilargia.games.core.CoreMatcher;
import com.ilargia.games.core.Entity;
import com.ilargia.games.core.Pool;
import com.ilargia.games.core.Pools;
import com.ilargia.games.entitas.EntityIndex;

public class EntityIndexExtension {

    public static final String PositionKey = "Position";

    public static void addEntityIndices(Pools pools) {
        com.ilargia.games.entitas.EntityIndex<String,Entity> positionIndex = new com.ilargia.games.entitas.EntityIndex(
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

    public static ObjectSet<Entity> getEntitiesWithPosition(Pool pool, int x, int y) {
        EntityIndex<String,Entity> index = (EntityIndex<String, Entity>) pool.getEntityIndex(PositionKey);
        return index.getEntities(x + "," + y);
    }
}
