package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringTransposeTest {
    private static StringTranspose reverse;
    @BeforeClass
    public static void setup(){
        reverse = new StringTranspose();
    }
    @AfterClass
    public static void Teardown(){
        reverse = null;
    }
    @Test
    public void transpose(){
        assertEquals("the string is not transposed","a kciuq nworb xof spmuj revo eht yzal god",reverse.transpose("a quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void transposeFailure(){
        assertNotNull("the function is not working",reverse.transpose("monohar is a lone nigga"));
    }
    @Test
    public void transposeCase(){
        assertEquals("ignore case when transposed","a kciuq nworb xof spmuj revo eht yzal god",reverse.transpose("A Quick Brown Fox Jumps Over The Lazy Dog"));
    }
}
