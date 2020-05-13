1
https://raw.githubusercontent.com/bkis/JMines/master/src/idh/java/jmines/ui/UiCallback.java
package idh.java.jmines.ui;

import idh.java.jmines.model.GameState;

/**
 * This interface represents a (generic) UI callback
 * for interation with the MineSweeper game core
 */
public interface UiCallback {
	
	/**
	 * This is a callback method from the UI to the game core.
	 * It receives two ints and returns the current GameState.
	 * @param i1 first int value
	 * @param i2 second int value
	 * @return The current game state as GameState object
	 */
	public GameState call(int i1, int i2);

}