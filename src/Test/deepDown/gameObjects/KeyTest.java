package deepDown.gameObjects;

import deepDown.level.Sprite;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyTest {
    private Sprite sprite;

    private Key testKey = new Key(0,0,40,40, sprite);

    @Test
    public void isPickedUp() throws Exception {
        assertFalse(testKey.isPickedUp());
    }

    @Test
    public void setPickedUp() throws Exception {
        testKey.setPickedUp(true);
        assertTrue(testKey.isPickedUp());
    }

}