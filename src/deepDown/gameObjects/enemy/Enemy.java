package deepDown.gameObjects.enemy;

import deepDown.level.Sprite;
import deepDown.gameObjects.DynamicGameObject;

/**
 * @author Michael Mobæk Thoresen and Ole-Martin Heggen
 */
@SuppressWarnings("ALL")
public abstract class Enemy extends DynamicGameObject {

    /**
     * Constructor.
     * @param x Specified x-coordinate
     * @param y Specified y-coordinate
     * @param width Specified width
     * @param height Specified height
     * @param sprite Specified {@code Sprite}.
     * @param xVelo Specified velocity on the X-axis.
     * @param yVelo Specified velocity on the Y-axis.
     */
    public Enemy(double x, double y, int width, int height, Sprite sprite, double xVelo, double yVelo) {
        super(x, y, width, height, sprite, xVelo, yVelo);
    }
}
