package deepDown.gameObjects;

import deepDown.level.Sprite;
import org.junit.Test;

import static org.junit.Assert.*;

public class AvatarTest {
    private Sprite sprite;


    Avatar testAvatar = new Avatar(0, 0, 30, 30, sprite, 0, 0);
    @Test
    public void setMovementState() throws Exception {
        testAvatar.setMovementState(false);
        assertFalse(testAvatar.getCanMoveDown());
        assertFalse(testAvatar.getCanMoveRight());
        assertFalse(testAvatar.getCanMoveLeft());
        assertFalse(testAvatar.getCanMoveUp());
    }

    @Test
    public void setCanMoveUp() throws Exception {
        testAvatar.setMoveUp(false);
        assertFalse(testAvatar.getCanMoveUp());
    }

    @Test
    public void setCanMoveDown() throws Exception {
        testAvatar.setMoveDown(false);
        assertFalse(testAvatar.getCanMoveDown());
    }

    @Test
    public void setCanMoveLeft() throws Exception {
        testAvatar.setMoveLeft(false);
        assertFalse(testAvatar.getCanMoveLeft());
    }

    @Test
    public void setCanMoveRight() throws Exception {
        testAvatar.setMoveRight(false);
        assertFalse(testAvatar.getCanMoveRight());
    }

    @Test
    public void getCanMoveUp() throws Exception {
        assertTrue(testAvatar.getCanMoveUp());
    }

    @Test
    public void getCanMoveDown() throws Exception {
        assertTrue(testAvatar.getCanMoveDown());
    }

    @Test
    public void getCanMoveLeft() throws Exception {
        assertTrue(testAvatar.getCanMoveLeft());
    }

    @Test
    public void getCanMoveRight() throws Exception {
        assertTrue(testAvatar.getCanMoveRight());
    }

}