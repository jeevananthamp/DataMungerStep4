package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class WordOccurenceTest {
    private static WordOccurence count;
    @BeforeClass
    public static void setup(){
        count = new WordOccurence();
    }
    @AfterClass
    public static void Teardown(){
        count = null;
    }
    @Test
    public void wordCount(){
        assertArrayEquals("",new String [] {"4-6","10-12","27-29"},count.wordCount("She sells seashells by the seashore","se"));
    }
    @Test
    public void  wordCountEmpty(){
        assertNull("function should return null if the regex does not match",count.wordCount("","se"));
    }
}
