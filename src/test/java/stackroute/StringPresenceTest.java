package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringPresenceTest {
    private static StringPresence find;
    @BeforeClass
    public static void setup(){
        find = new StringPresence();
    }
    @AfterClass
    public static void Teardown(){
        find = null;
    }
    @Test
    public void findWord(){
        assertEquals("the word Harry is not found check regex pattern","is Harry here ? True",find.findWord("This is Harry."));
    }
    @Test
    public void findWordNotAvailable(){
        assertEquals("the function is not giving correct boolean value","is Harry here ? False",find.findWord("this is Henry"));
    }
    @Test
    public void findWordCase(){
        assertEquals("the function is not considering the case of word Harry","is Harry here ? True",find.findWord("this is harry"));
    }
    @Test
    public void findWordNotAvailableCase(){
        assertEquals("the function is not considering the case of word Harry","is Harry here ? False",find.findWord("this is harold"));
    }
}
