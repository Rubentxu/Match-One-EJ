package com.ilargia.games.core;

import com.ilargia.games.components.Interactive;
import com.ilargia.games.components.GameBoard;
import com.ilargia.games.components.GameBoardElement;
import com.ilargia.games.components.Movable;
import com.ilargia.games.components.Destroy;
import com.ilargia.games.components.Position;
import com.ilargia.games.components.Asset;
import com.ilargia.games.components.View;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class CoreComponentIds {

	public static final int Interactive = 0;
	public static final int GameBoard = 1;
	public static final int GameBoardElement = 2;
	public static final int Movable = 3;
	public static final int Destroy = 4;
	public static final int Position = 5;
	public static final int Asset = 6;
	public static final int View = 7;
	public static final int totalComponents = 8;

	public static String[] componentNames() {
		return new String[]{"Interactive", "GameBoard", "GameBoardElement",
				"Movable", "Destroy", "Position", "Asset", "View"};
	}

	public static Class[] componentTypes() {
		return new Class[]{Interactive.class, GameBoard.class,
				GameBoardElement.class, Movable.class, Destroy.class,
				Position.class, Asset.class, View.class};
	}
}