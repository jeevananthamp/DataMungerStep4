package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class WordSortTest {
    private static WordSort sort;
    @BeforeClass
    public static void setup(){
        sort = new WordSort();
    }
    @AfterClass
    public static void Teardown(){
        sort = null;
    }
    @Test
    public void testSort(){
        assertArrayEquals("Check whether the sort is done properly",new String[]{"a","makes","man","perfect","practice"},sort.sortString("Practice makes a man perfect"));
    }
    @Test
    public void testSortFailure(){
        assertNotNull("The function is not working",sort.sortString(" Subspecies breed from southeastern Alaska and southern Canada to Mexico"));
    }
}
