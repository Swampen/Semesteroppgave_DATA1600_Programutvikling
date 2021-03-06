package deepDown.gameObjects;

import deepDown.level.Sprite;

/**
 * @author Michael Mobæk Thoresen and Ole-Martin Heggen
 */
public class Key extends Pickup {

    /**
     * Constructor.
     * @param x Specified x-coordinate.
     * @param y Specified y-coordinate.
     * @param width Specified width.
     * @param height Specified height.
     * @param sprite Specified {@code Sprite}.
     */
    public Key(double x, double y, int width, int height, Sprite sprite) {
        super(x, y, width, height, sprite);
    }
}
