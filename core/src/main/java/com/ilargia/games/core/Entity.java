package com.ilargia.games.core;

import com.ilargia.games.entitas.EntityMetaData;
import com.ilargia.games.entitas.interfaces.IComponent;
import java.util.Stack;
import com.ilargia.games.components.Interactive;
import com.ilargia.games.components.GameBoard;
import com.ilargia.games.components.GameBoardElement;
import com.ilargia.games.components.Movable;
import com.ilargia.games.components.BurstMode;
import com.ilargia.games.components.Score;
import com.ilargia.games.components.Destroy;
import com.ilargia.games.components.Position;
import com.ilargia.games.components.Asset;
import com.ilargia.games.components.Input;
import com.ilargia.games.components.View;
import com.badlogic.gdx.graphics.Texture;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Entity extends com.ilargia.games.entitas.Entity {

	public Interactive InteractiveComponent = new Interactive();
	public GameBoardElement GameBoardElementComponent = new GameBoardElement();
	public Movable MovableComponent = new Movable();
	public BurstMode BurstModeComponent = new BurstMode();
	public Destroy DestroyComponent = new Destroy();

	public Entity(int totalComponents, Stack<IComponent>[] componentPools,
			EntityMetaData entityMetaData) {
		super(totalComponents, componentPools, entityMetaData);
	}

	public boolean isInteractive() {
		return hasComponent(CoreComponentIds.Interactive);
	}

	public Entity setInteractive(boolean value) {
		if (value != hasComponent(CoreComponentIds.Interactive)) {
			if (value) {
				addComponent(CoreComponentIds.Interactive, InteractiveComponent);
			} else {
				removeComponent(CoreComponentIds.Interactive);
			}
		}
		return this;
	}

	public GameBoard getGameBoard() {
		return (GameBoard) getComponent(CoreComponentIds.GameBoard);
	}

	public boolean hasGameBoard() {
		return hasComponent(CoreComponentIds.GameBoard);
	}

	public Entity addGameBoard(int columns, int rows) {
		GameBoard component = (GameBoard) recoverComponent(CoreComponentIds.GameBoard);
		if (component == null) {
			component = new GameBoard(columns, rows);
		} else {
			component.columns = columns;;
			component.rows = rows;
		}
		addComponent(CoreComponentIds.GameBoard, component);
		return this;
	}

	public Entity replaceGameBoard(int columns, int rows) {
		GameBoard component = (GameBoard) recoverComponent(CoreComponentIds.GameBoard);
		if (component == null) {
			component = new GameBoard(columns, rows);
		} else {
			component.columns = columns;;
			component.rows = rows;
		}
		replaceComponent(CoreComponentIds.GameBoard, component);
		return this;
	}

	public Entity removeGameBoard() {
		removeComponent(CoreComponentIds.GameBoard);
		return this;
	}

	public boolean isGameBoardElement() {
		return hasComponent(CoreComponentIds.GameBoardElement);
	}

	public Entity setGameBoardElement(boolean value) {
		if (value != hasComponent(CoreComponentIds.GameBoardElement)) {
			if (value) {
				addComponent(CoreComponentIds.GameBoardElement,
						GameBoardElementComponent);
			} else {
				removeComponent(CoreComponentIds.GameBoardElement);
			}
		}
		return this;
	}

	public boolean isMovable() {
		return hasComponent(CoreComponentIds.Movable);
	}

	public Entity setMovable(boolean value) {
		if (value != hasComponent(CoreComponentIds.Movable)) {
			if (value) {
				addComponent(CoreComponentIds.Movable, MovableComponent);
			} else {
				removeComponent(CoreComponentIds.Movable);
			}
		}
		return this;
	}

	public boolean isBurstMode() {
		return hasComponent(InputComponentIds.BurstMode);
	}

	public Entity setBurstMode(boolean value) {
		if (value != hasComponent(InputComponentIds.BurstMode)) {
			if (value) {
				addComponent(InputComponentIds.BurstMode, BurstModeComponent);
			} else {
				removeComponent(InputComponentIds.BurstMode);
			}
		}
		return this;
	}

	public Score getScore() {
		return (Score) getComponent(ScoreComponentIds.Score);
	}

	public boolean hasScore() {
		return hasComponent(ScoreComponentIds.Score);
	}

	public Entity addScore(int value) {
		Score component = (Score) recoverComponent(ScoreComponentIds.Score);
		if (component == null) {
			component = new Score();
		}
		component.value = value;
		addComponent(ScoreComponentIds.Score, component);
		return this;
	}

	public Entity replaceScore(int value) {
		Score component = (Score) recoverComponent(ScoreComponentIds.Score);
		if (component == null) {
			component = new Score();
		}
		component.value = value;
		removeComponent(ScoreComponentIds.Score);
		return this;
	}

	public Entity removeScore() {
		removeComponent(ScoreComponentIds.Score);
		return this;
	}

	public boolean isDestroy() {
		return hasComponent(CoreComponentIds.Destroy);
	}

	public Entity setDestroy(boolean value) {
		if (value != hasComponent(CoreComponentIds.Destroy)) {
			if (value) {
				addComponent(CoreComponentIds.Destroy, DestroyComponent);
			} else {
				removeComponent(CoreComponentIds.Destroy);
			}
		}
		return this;
	}

	public Position getPosition() {
		return (Position) getComponent(CoreComponentIds.Position);
	}

	public boolean hasPosition() {
		return hasComponent(CoreComponentIds.Position);
	}

	public Entity addPosition(int x, int y) {
		Position component = (Position) recoverComponent(CoreComponentIds.Position);
		if (component == null) {
			component = new Position(x, y);
		} else {
			component.x = x;;
			component.y = y;
		}
		addComponent(CoreComponentIds.Position, component);
		return this;
	}

	public Entity replacePosition(int x, int y) {
		Position component = (Position) recoverComponent(CoreComponentIds.Position);
		if (component == null) {
			component = new Position(x, y);
		} else {
			component.x = x;;
			component.y = y;
		}
		replaceComponent(CoreComponentIds.Position, component);
		return this;
	}

	public Entity removePosition() {
		removeComponent(CoreComponentIds.Position);
		return this;
	}

	public Asset getAsset() {
		return (Asset) getComponent(CoreComponentIds.Asset);
	}

	public boolean hasAsset() {
		return hasComponent(CoreComponentIds.Asset);
	}

	public Entity addAsset(String name) {
		Asset component = (Asset) recoverComponent(CoreComponentIds.Asset);
		if (component == null) {
			component = new Asset(name);
		} else {
			component.name = name;
		}
		addComponent(CoreComponentIds.Asset, component);
		return this;
	}

	public Entity replaceAsset(String name) {
		Asset component = (Asset) recoverComponent(CoreComponentIds.Asset);
		if (component == null) {
			component = new Asset(name);
		} else {
			component.name = name;
		}
		replaceComponent(CoreComponentIds.Asset, component);
		return this;
	}

	public Entity removeAsset() {
		removeComponent(CoreComponentIds.Asset);
		return this;
	}

	public Input getInput() {
		return (Input) getComponent(InputComponentIds.Input);
	}

	public boolean hasInput() {
		return hasComponent(InputComponentIds.Input);
	}

	public Entity addInput(int x, int y) {
		Input component = (Input) recoverComponent(InputComponentIds.Input);
		if (component == null) {
			component = new Input(x, y);
		} else {
			component.x = x;;
			component.y = y;
		}
		addComponent(InputComponentIds.Input, component);
		return this;
	}

	public Entity replaceInput(int x, int y) {
		Input component = (Input) recoverComponent(InputComponentIds.Input);
		if (component == null) {
			component = new Input(x, y);
		} else {
			component.x = x;;
			component.y = y;
		}
		replaceComponent(InputComponentIds.Input, component);
		return this;
	}

	public Entity removeInput() {
		removeComponent(InputComponentIds.Input);
		return this;
	}

	public View getView() {
		return (View) getComponent(CoreComponentIds.View);
	}

	public boolean hasView() {
		return hasComponent(CoreComponentIds.View);
	}

	public Entity addView(Texture texture) {
		View component = (View) recoverComponent(CoreComponentIds.View);
		if (component == null) {
			component = new View(texture);
		} else {
			component.texture = texture;
		}
		addComponent(CoreComponentIds.View, component);
		return this;
	}

	public Entity replaceView(Texture texture) {
		View component = (View) recoverComponent(CoreComponentIds.View);
		if (component == null) {
			component = new View(texture);
		} else {
			component.texture = texture;
		}
		replaceComponent(CoreComponentIds.View, component);
		return this;
	}

	public Entity removeView() {
		removeComponent(CoreComponentIds.View);
		return this;
	}
}