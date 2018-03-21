import org.junit.Test;
import sample.Avatar;

import static org.junit.Assert.*;

public class AvatarTest {
    private Avatar test = new Avatar(0,0, 40, 40, 3, true, 0, 0);
    @Test
    public void getLives() throws Exception {

        assertEquals (3, test.getLives());
    }

    @Test
    public void setLives() throws Exception {
        test.setLives(2);
        assertEquals(2,test.getLives());
    }

    @Test
    public void isAlive() throws Exception {
        assertTrue(test.isAlive());
    }

    @Test
    public void setAlive() throws Exception {
        test.setAlive(false);
        assertFalse(test.isAlive());
    }

}